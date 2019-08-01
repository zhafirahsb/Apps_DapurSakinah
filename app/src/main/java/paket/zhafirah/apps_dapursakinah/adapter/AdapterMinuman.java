package paket.zhafirah.apps_dapursakinah.adapter;

import android.content.Context;
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
import paket.zhafirah.apps_dapursakinah.model.MinumanModel;

import java.util.List;

public class AdapterMinuman extends RecyclerView.Adapter<AdapterMinuman.GridViewHolder>{
    private Context context;
    private List<MinumanModel> listMinuman;

    public AdapterMinuman(Context context) {
        this.context = context;
    }

    public List<MinumanModel> getListMinuman() {
        return listMinuman;
    }

    public void setListMinuman(List<MinumanModel> listMinuman) {
        this.listMinuman = listMinuman;
    }

    @NonNull
    @Override
    public AdapterMinuman.GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.minuman, parent, false);
        return new AdapterMinuman.GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final AdapterMinuman.GridViewHolder holder, final int position) {
        Glide.with(context).load("http://saki.dscunikom.com/uploads/gambar/"+getListMinuman().get(position).getGambar()).override(200,200).into(holder.imgPhoto);

//        Picasso.get().load("http://saki.dscunikom.com/uploads/gambar/"+getListMinuman().get(position).getGambar()).into(holder.imgPhoto);
//        Glide.with(context)
//                .load(getListMakanan().get(position).getPhoto())
//                .apply(new RequestOptions().override(350, 550))
//                .into(holder.imgPhoto);
        holder.text2.setText(getListMinuman().get(position).getNamaMinuman());
//        holder.cardView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(context,holder.text2.getText(),Toast.LENGTH_SHORT).show();
//                Minuman minuman = new Minuman();
//                minuman.setPhoto(listMinuman.get(position).getPhoto());
//                minuman.setNama(listMinuman.get(position).getNama());
//                minuman.setAlat(listMinuman.get(position).getAlat());
//                minuman.setCaraPembuatan(listMinuman.get(position).getCaraPembuatan());
//                Intent intent = new Intent(context, DetailMinuman.class);
//                intent.putExtra(DetailMinuman.EXTRA_MINUMAN,minuman);
//                context.startActivity(intent);
//            }
//        });

    }

    @Override
    public int getItemCount() {
        return getListMinuman().size();
    }


    class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView text2;
        CardView cardView;
        GridViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.minuman);
            text2 = itemView.findViewById(R.id.text2);
            cardView = itemView.findViewById(R.id.card_minuman);
        }
    }
}

