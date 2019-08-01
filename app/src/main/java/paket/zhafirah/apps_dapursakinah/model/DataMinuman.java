package paket.zhafirah.apps_dapursakinah.model;

import java.util.ArrayList;

public class DataMinuman {
    public static String[][] data = new String[][]{
            {"Jus", "Alat dan bahan Jus","Cara Pembuatan Jus", "https://cdn1-production-images-kly.akamaized.net/u7ZaERLGoe8NOgJ9UrYJT7oj8IM=/640x360/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/2211436/original/061018500_1526231689-jus-buah-segar.jpg" },
            {"Es Kelapa","Alat dan Bahan Es Kelapa","Cara Pembuatan Es Kelapa", "http://afronesiatours.co.za/wp-content/uploads/2017/10/es-kelapa-muda.jpg"},
                    {"Es Campur","Alat dan Bahan Es Campur","Cara Pembuatan Es Campur","http://dcendol.com/wp-content/uploads/2018/03/Es-Campur-Dcendol.jpg"}

    };


    public static ArrayList<Minuman> getListData(){
        ArrayList<Minuman> list = new ArrayList<>();
        for (String[] aData : data) {
            Minuman minuman = new Minuman();
            minuman.setNama(aData[0]);
            minuman.setAlat(aData[1]);
            minuman.setCaraPembuatan(aData[2]);
            minuman.setPhoto(aData[3]);

            list.add(minuman);
        }

        return list;
    }
}
