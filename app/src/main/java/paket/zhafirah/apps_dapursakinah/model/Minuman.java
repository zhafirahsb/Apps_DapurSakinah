package paket.zhafirah.apps_dapursakinah.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Minuman implements Parcelable {
    private String nama,alat,caraPembuatan,photo;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlat() {
        return alat;
    }

    public void setAlat(String alat) {
        this.alat = alat;
    }

    public String getCaraPembuatan() {
        return caraPembuatan;
    }

    public void setCaraPembuatan(String caraPembuatan) {
        this.caraPembuatan = caraPembuatan;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nama);
        dest.writeString(this.alat);
        dest.writeString(this.caraPembuatan);
        dest.writeString(this.photo);
    }

    public Minuman() {
    }

    protected Minuman(Parcel in) {
        this.nama = in.readString();
        this.alat = in.readString();
        this.caraPembuatan = in.readString();
        this.photo = in.readString();
    }

    public static final Creator<Minuman> CREATOR = new Creator<Minuman>() {
        @Override
        public Minuman createFromParcel(Parcel source) {
            return new Minuman(source);
        }

        @Override
        public Minuman[] newArray(int size) {
            return new Minuman[size];
        }
    };
}
