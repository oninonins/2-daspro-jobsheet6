public class Dosen05 {

    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;



    Dosen05(String kd, String name, boolean jk, int age){
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;

    }


    void tampil(){
        System.out.println("Kode dosen          : " + kode);
        System.out.println("Nama dosen          : " + nama);
        System.out.println("Jenis kelamin dosen : " + jenisKelamin);
        System.out.println("Usia dosen          : " + usia);
    }
}