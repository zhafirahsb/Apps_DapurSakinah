package paket.zhafirah.apps_dapursakinah.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MakananModel {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("nama_makanan")
    @Expose
    private String namaMakanan;
    @SerializedName("gambar")
    @Expose
    private String gambar;
    @SerializedName("resep")
    @Expose
    private String resep;
    @SerializedName("bahan")
    @Expose
    private String bahan;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public void setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getResep() {
        return resep;
    }

    public void setResep(String resep) {
        this.resep = resep;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }
}
