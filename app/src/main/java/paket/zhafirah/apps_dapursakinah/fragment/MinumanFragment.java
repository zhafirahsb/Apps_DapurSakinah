package paket.zhafirah.apps_dapursakinah.fragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import paket.zhafirah.apps_dapursakinah.ItemClickSupport;
import paket.zhafirah.apps_dapursakinah.R;
import paket.zhafirah.apps_dapursakinah.activity.DetailMinuman;
import paket.zhafirah.apps_dapursakinah.adapter.AdapterMinuman;
import paket.zhafirah.apps_dapursakinah.model.MinumanModel;
import paket.zhafirah.apps_dapursakinah.model.MinumanResult;
import paket.zhafirah.apps_dapursakinah.retrofit.ApiInterface;
import paket.zhafirah.apps_dapursakinah.retrofit.ApiRepository;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class MinumanFragment extends Fragment {
    RecyclerView recyclerView;
    private ArrayList<MinumanModel> listMinuman;


    public MinumanFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_minuman, container, false);
        recyclerView = view.findViewById(R.id.recycler_minuman);
//        listMinuman = new ArrayList<>();
//        listMinuman.addAll(DataMinuman.getListData());
//        showRecyclerGrid();
        getData();
        return view;
    }


//    private void showRecyclerGrid() {
//        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));
//        AdapterMinuman gridAdapter = new AdapterMinuman(getContext());
//        gridAdapter.setListMinuman(listMinuman);
//        recyclerView.setAdapter(gridAdapter);
//    }

    private void clickItemDetail(MinumanModel minuman){
        Intent detailActivity = new Intent(getActivity(), DetailMinuman.class);
        detailActivity.putExtra("id_minuman",minuman.getId());
        detailActivity.putExtra("nama_minuman",minuman.getNamaMinuman());
        detailActivity.putExtra("gambar_minuman",minuman.getGambar());
        detailActivity.putExtra("resep_minuman",minuman.getResep());
        detailActivity.putExtra("alat_dan_bahan", minuman.getBahan());


//        Log.e("id", minuman.getId());
//        Log.e("nama minuman", minuman.getNamaMinuman());
//        Log.e("resep", minuman.getResep());
        startActivity(detailActivity);
        getActivity().overridePendingTransition(0,0);
    }

    private void getData(){
        final AdapterMinuman adapterMinuman = new AdapterMinuman(this.getActivity());
        ApiInterface apiInterface = ApiRepository.getUrl().create(ApiInterface.class);
        Call<MinumanResult> call = apiInterface.getMinuman();
        call.enqueue(new Callback<MinumanResult>() {
            @Override
            public void onResponse(Call<MinumanResult> call, Response<MinumanResult> response) {
                List<MinumanModel> minumanList = response.body().getResult();
                adapterMinuman.setListMinuman(minumanList);
                reloadView(adapterMinuman,minumanList);
            }

            @Override
            public void onFailure(Call<MinumanResult> call, Throwable t) {

            }
        });
    }

    public void reloadView(RecyclerView.Adapter adapter, final List<MinumanModel> list ){
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));
        recyclerView.setAdapter(adapter);
        ItemClickSupport.addTo(recyclerView).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, final int position, View v) {
                clickItemDetail(list.get(position));
            }
        });
    }

}
