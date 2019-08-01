package paket.zhafirah.apps_dapursakinah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import paket.zhafirah.apps_dapursakinah.R;

public class SplashScreen extends AppCompatActivity {

    private ImageView ikon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        ikon=findViewById(R.id.ikonview);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //Do something after 100ms

                Intent intent = new Intent(SplashScreen.this,MainActivity.class);
                startActivity(intent);

                finish();
            }
        }, 3000);

        Animation animasi = AnimationUtils.loadAnimation(this, R.anim.splashanimation);
        ikon.startAnimation(animasi);
    }
}
