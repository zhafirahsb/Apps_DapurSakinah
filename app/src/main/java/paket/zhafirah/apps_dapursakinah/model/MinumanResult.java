package paket.zhafirah.apps_dapursakinah.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MinumanResult {
    @SerializedName("result")
    @Expose
    private List<MinumanModel> result = null;

    public List<MinumanModel> getResult() {
        return result;
    }

    public void setResult(List<MinumanModel> result) {
        this.result = result;
    }
}
