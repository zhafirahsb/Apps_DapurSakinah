package paket.zhafirah.apps_dapursakinah;

import android.os.Bundle;

import paket.zhafirah.apps_dapursakinah.R;

import paket.zhafirah.apps_dapursakinah.fragment.MakananFragment;
import paket.zhafirah.apps_dapursakinah.fragment.MinumanFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment onFragment = null;
            switch (item.getItemId()) {
                case R.id.navigation_makanan:
                    onFragment = new MakananFragment();
                    break;
                case R.id.navigation_minuman:
                    onFragment = new MinumanFragment();
                    break;

            }

            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,onFragment).commit();
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        mTextMessage = findViewById(R.id.message);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new MakananFragment()).commit();
        }
    }

}
