package paket.zhafirah.apps_dapursakinah.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import paket.zhafirah.apps_dapursakinah.R;
import com.squareup.picasso.Picasso;

public class DetailMakanan extends AppCompatActivity {

    //public static final String EXTRA_MAKANAN = "extra_makanan";
    ImageView fotoMakanan;
    TextView namaMakanan,alatBahan,cara;
    TextView backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_makanan);

        fotoMakanan = findViewById(R.id.foto_makanan);
        namaMakanan =findViewById(R.id.nama_makanan);
        alatBahan = findViewById(R.id.alat_bahan_makanan);
        cara = findViewById(R.id.cara_pembuatan);
        backButton = findViewById(R.id.icon_back);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        namaMakanan.setText(getIntent().getStringExtra("nama_makanan"));
        Picasso.get().load("http://saki.dscunikom.com/uploads/gambar/"+getIntent().getStringExtra("gambar_makanan")).into(fotoMakanan);
        cara.setText(getIntent().getStringExtra("resep_makanan"));
        alatBahan.setText(getIntent().getStringExtra("alat_dan_bahan"));



//        Picasso.get().load(makanan.getGambar()).into(fotoMakanan);
//        namaMakanan.setText(Objects.requireNonNull(makanan).getNamaMakanan());
//        alatBahan.setText(makanan.getResep());
//        cara.setText(makanan.getResep());
    }
}
