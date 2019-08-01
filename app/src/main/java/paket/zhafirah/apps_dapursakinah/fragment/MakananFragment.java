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
import paket.zhafirah.apps_dapursakinah.activity.DetailMakanan;
import paket.zhafirah.apps_dapursakinah.adapter.AdapterMakanan;
import paket.zhafirah.apps_dapursakinah.model.MakananModel;
import paket.zhafirah.apps_dapursakinah.model.MakananResult;
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
public class MakananFragment extends Fragment {

    RecyclerView recyclerView;
    private ArrayList<MakananModel> listMakanan;
    public MakananFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_makanan, container, false);
        recyclerView = view.findViewById(R.id.recycler_makanan);
//        listMakanan = new ArrayList<>();
//        listMakanan.addAll(DataMakanan.getListData());
//        showRecyclerGrid();
        getData();
        return view;
    }

//    private void showRecyclerGrid() {
//        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));
//        AdapterMakanan gridAdapter = new AdapterMakanan(getContext());
//        gridAdapter.setListMakanan(listMakanan);
//        recyclerView.setAdapter(gridAdapter);
//    }

    private void clickItemDetail(MakananModel makanan){
        Intent detailActivity = new Intent(getActivity(), DetailMakanan.class);
        detailActivity.putExtra("id_makanan",makanan.getId());
        detailActivity.putExtra("nama_makanan",makanan.getNamaMakanan());
        detailActivity.putExtra("gambar_makanan",makanan.getGambar());
        detailActivity.putExtra("resep_makanan",makanan.getResep());
        detailActivity.putExtra("alat_dan_bahan", makanan.getBahan());


//        Log.e("id", makanan.getId());
//        Log.e("nama makanan", makanan.getNamaMakanan());
//        Log.e("resep", makanan.getResep());
        startActivity(detailActivity);
        getActivity().overridePendingTransition(0,0);
    }

    private void getData(){
        final AdapterMakanan adapterMakanan = new AdapterMakanan(this.getActivity());
        ApiInterface apiInterface = ApiRepository.getUrl().create(ApiInterface.class);
        Call<MakananResult> call = apiInterface.getMakanan();
        call.enqueue(new Callback<MakananResult>() {
            @Override
            public void onResponse(Call<MakananResult> call, Response<MakananResult> response) {
                List<MakananModel> makananList = response.body().getResult();
                adapterMakanan.setListMakanan(makananList);
                reloadView(adapterMakanan,makananList);
            }

            @Override
            public void onFailure(Call<MakananResult> call, Throwable t) {

            }
        });
    }

    public void reloadView(RecyclerView.Adapter adapter, final List<MakananModel> list ){
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
