package paket.zhafirah.apps_dapursakinah.retrofit;

import paket.zhafirah.apps_dapursakinah.model.MakananResult;
import paket.zhafirah.apps_dapursakinah.model.MinumanResult;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("makanan")
    Call<MakananResult> getMakanan();

    @GET("minuman")
    Call<MinumanResult> getMinuman();
}
