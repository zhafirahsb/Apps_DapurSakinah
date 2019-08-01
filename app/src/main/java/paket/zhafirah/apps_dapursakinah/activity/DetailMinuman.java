package paket.zhafirah.apps_dapursakinah.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import paket.zhafirah.apps_dapursakinah.R;
import com.squareup.picasso.Picasso;

public class DetailMinuman extends AppCompatActivity {

//    public static final String EXTRA_MINUMAN = "extra_minuman";
    ImageView fotoMinuman;
    TextView namaMinuman,alatBahan,cara,backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_minuman);

        fotoMinuman = findViewById(R.id.foto_minuman);
        namaMinuman =findViewById(R.id.nama_minuman);
        alatBahan = findViewById(R.id.alat_bahan_minuman);
        cara = findViewById(R.id.cara_pembuatan2);
        backButton = findViewById(R.id.icon_back);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        namaMinuman.setText(getIntent().getStringExtra("nama_minuman"));
        Picasso.get().load("http://saki.dscunikom.com/uploads/gambar/"+getIntent().getStringExtra("gambar_minuman")).into(fotoMinuman);
        cara.setText(getIntent().getStringExtra("resep_minuman"));
        alatBahan.setText(getIntent().getStringExtra("alat_dan_bahan"));
//        Minuman minuman = getIntent().getParcelableExtra(EXTRA_MINUMAN);
////
////        Picasso.get().load(minuman.getPhoto()).into(fotoMinuman);
////        namaMinuman.setText(Objects.requireNonNull(minuman).getNama());
////        alatBahan.setText(minuman.getAlat());
////        cara.setText(minuman.getCaraPembuatan());
    }
}
