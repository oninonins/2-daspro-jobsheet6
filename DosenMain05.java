import java.util.Scanner;
public class DosenMain05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataDosen05 data = new DataDosen05();

        int pilih;
        do {
            System.out.println("Menu: ");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Pencarian Nama (Sequential Search)");
            System.out.println("4. Binary Search (Sorting ASC)");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    data.tambah();
                    break;
                case 2:
                    System.out.println("Data Dosen:");
                    data.tampil();
                    break;
                case 3:
                    System.out.print("Masukkan Nama Dosen yang Dicari: ");
                    String cariNama = input.next();
                    String hasil = data.PencarianDataSequential(cariNama);
                    System.out.println(hasil);
                    break;
                case 4:
                    //data diurutkan dulu 
                    data.SortingASC(); 
                    System.out.print("Masukkan Usia Dosen yang Dicari: ");
                    int cariUsia = input.nextInt();
                    String hasilUsia = data.PencarianDataBinary05(cariUsia);
                    System.out.println(hasilUsia);
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 5);

        
    }
}
