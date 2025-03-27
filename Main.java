import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //declarasi 
        MahasiswaBerprestasi05 list = new MahasiswaBerprestasi05();
        Scanner sc = new Scanner(System.in);
        int jumMhs = 5;

        //perulangan untuk input data mahasiswa
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM : ");
            String nim = sc.nextLine();
            System.out.print("Nama : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK : ");
            double ipk = Double.parseDouble(sc.nextLine());
            System.out.println("-----------------------------");
            list.tambah(new Mahasiswa05(nim, nama, kelas, ipk));
            
        }
            list.tampil();

            //melakukan pencrian data squential s
            // System.out.println("-------------------------------------------------");
            // System.out.println("Pencarian Data ");
            // System.out.println("-------------------------------------------------");
            // System.out.println("Masukkan IPK mahasiswa yang dicari : ");
            // System.out.print("IPK : ");
            // double cari = Double.parseDouble(sc.nextLine());

            // System.out.println("menggunakan sequential searching");
            // double posisi = list.sequentialSearching(cari);
            // int pss = (int) posisi;
            // list.tampilPosisi(cari, pss);
            // list.tampilDataSearch(cari, pss);

            //melakukan pencarian data binary 
            System.out.println("-------------------------------------------------");
            System.out.println("Pencarian Data ");
            System.out.println("-------------------------------------------------");
            System.out.println("Masukkan IPK mahasiswa yang dicari : ");
            System.out.print("IPK : ");
            double cari = Double.parseDouble(sc.nextLine());
            System.out.println("------------------------------");
            System.out.println("menggunakan binary searching");
            double posisi = list.findBinary(cari, 0, jumMhs - 1);
            int pss2 = (int) posisi;
            list.tampilPosisi(cari, pss2);
            list.tampilDataSearch(cari, pss2);

        
    }
}