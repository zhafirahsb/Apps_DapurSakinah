package paket.zhafirah.apps_dapursakinah.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MakananResult {
    @SerializedName("result")
    @Expose
    private List<MakananModel> result = null;

    public List<MakananModel> getResult() {
        return result;
    }

    public void setResult(List<MakananModel> result) {
        this.result = result;
    }
}
