package paket.zhafirah.apps_dapursakinah.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import paket.zhafirah.apps_dapursakinah.R;
import paket.zhafirah.apps_dapursakinah.model.MakananModel;

import java.util.List;

public class AdapterMakanan extends RecyclerView.Adapter<AdapterMakanan.GridViewHolder>{
    private Context context;
    private List<MakananModel> listMakanan;

    public AdapterMakanan(Context context) {
        this.context = context;
    }

    public List<MakananModel> getListMakanan() {
        return listMakanan;
    }

    public void setListMakanan(List<MakananModel> listMakanan) {
        this.listMakanan = listMakanan;
    }

    @NonNull
    @Override
    public AdapterMakanan.GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.makanan, parent, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final AdapterMakanan.GridViewHolder holder, final int position) {
        Log.e("Gambar : ","http://192.168.0.124/sakinah/uploads/gambar/"+getListMakanan().get(position).getGambar());
        Glide.with(context).load("http://saki.dscunikom.com/uploads/gambar/"+getListMakanan().get(position).getGambar()).override(200,200).into(holder.imgPhoto);
//        Picasso.get().load("http://saki.dscunikom.com/uploads/gambar/"+getListMakanan().get(position).getGambar()).into(holder.imgPhoto);
//        Glide.with(context)
//                .load(getListMakanan().get(position).getPhoto())
//                .apply(new RequestOptions().override(350, 550))
//                .into(holder.imgPhoto);
        holder.text1.setText(getListMakanan().get(position).getNamaMakanan());
//        holder.cardView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(context,holder.text1.getText(),Toast.LENGTH_SHORT).show();
//                MakananModel makanan = new MakananModel();
//                makanan.setGambar(listMakanan.get(position).getGambar());
//                makanan.setNamaMakanan(listMakanan.get(position).getNamaMakanan());
//                makanan.setResep(listMakanan.get(position).getResep());
//                makanan.setResep(listMakanan.get(position).getResep());
//
//            }
//        });

    }

    @Override
    public int getItemCount() {
        return getListMakanan().size();
    }

    class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView text1;
        CardView cardView;
        GridViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.makanan1);
            text1 = itemView.findViewById(R.id.text1);
            cardView = itemView.findViewById(R.id.card_makanan);
        }
    }
}
