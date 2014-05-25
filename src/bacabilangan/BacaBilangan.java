/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bacabilangan;

/**
 *
 * @author root
 */
public class BacaBilangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(bacaBilangan(1000156001));
        System.out.println(bacaBilangan(1505));
        System.out.println(bacaBilangan(5));
        System.out.println(bacaBilangan(20));
        System.out.println(bacaBilangan(057));

    }

    /**
     * Method ini akan merubah angka yang diinputkan dengan tipe int menjadi
     * pembacaan bilangan dengan tipe String.
     *
     * @param bil bilangan yang diinputkan, bertipe int
     * @return hasil - output berupa String pembacaan bilangan
     */
    public static String bacaBilangan(int bil) {
        String[] terbilang = {"", "Satu", "Dua", "Tiga", "Empat", "Lima",
            "Enam", "Tujuh", "Delapan", "Sebilan", "Sepuluh", "Sebelas"};
        String hasil = "";

        if (bil < 12) {
            hasil += terbilang[bil];
        } else if (bil >= 12 && bil < 20) {
            hasil += bacaBilangan(bil - 10) + " Belas";
        } else if (bil >= 20 && bil < 100) {
            hasil += bacaBilangan(bil / 10) + " Puluh " + bacaBilangan(bil % 10);
        } else if (bil >= 100 && bil < 200) {
            hasil += "Seratus " + bacaBilangan(bil - 100);
        } else if (bil >= 200 && bil < 1000) {
            hasil += bacaBilangan(bil / 100) + " Ratus " + bacaBilangan(bil % 100);
        } else if (bil >= 1000 && bil < 2000) {
            hasil += "Seribu " + bacaBilangan(bil - 1000);
        } else if (bil >= 2000 && bil < 1000000) {
            hasil += bacaBilangan(bil / 1000) + " Ribu " + bacaBilangan(bil % 1000);
        } else if (bil >= 1000000 && bil < 1000000000) {
            hasil += bacaBilangan(bil / 1000000) + " Juta "
                    + bacaBilangan(bil % 1000000);
        } else if (bil >= 1000000000) {
            hasil += bacaBilangan(bil / 1000000000) + " Miliyar "
                    + bacaBilangan(bil % 1000000000);
        }
        return hasil;
    }

}
