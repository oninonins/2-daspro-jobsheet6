import java.util.Scanner;
public class DataDosen05 {
    Scanner input = new Scanner(System.in);
    Dosen05[] dosen = new Dosen05[10];
    int idx = 0; 

    // Tambah data dosen
    void tambah() { 
        if (idx < dosen.length) {
            System.out.print("Masukkan Kode Dosen : ");
            String kd = input.next();
            System.out.print("Masukkan Nama Dosen : ");
            String name = input.next();
            System.out.print("Masukkan Jenis Kelamin Dosen (pria/wanita) : ");
            String jkInput = input.next().toLowerCase();
            boolean jk = jkInput.equalsIgnoreCase("pria");;
            System.out.print("Masukkan Usia Dosen : ");
            int age = input.nextInt();


            dosen[idx] = new Dosen05(kd, name, jk, age);
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    // Tampil data
    void tampil() {
        for (Dosen05 m : dosen) {
            if (m != null) {
                m.tampil();
            }
        }
    }
    

    // Bubble Sort ASC \
    void SortingASC() {
        for (int i = 0; i < idx - 1; i++) { 
            for (int j = 1; j < idx - i; j++) { 
                if (dosen[j].usia < dosen[j - 1].usia) {
                    Dosen05 temp = dosen[j];
                    dosen[j] = dosen[j - 1];
                    dosen[j - 1] = temp;
                }
            }
        }
    }
    

    // Selection Sort DESC \
    void SortingDSC() {
        for (int i = 0; i < idx; i++) {
            int idxmax = i;
            for (int j = i + 1; j < idx; j++) { 
                if (dosen[j].usia > dosen[idxmax].usia) {
                    idxmax = j;
                }
            }
            Dosen05 temp = dosen[idxmax];
            dosen[idxmax] = dosen[i];
            dosen[i] = temp;
        }
    }
    

    // Insertion Sort DESC 
    void SortingDSCInsertion() {
        for (int i = 1; i < idx; i++) { 
            Dosen05 temp = dosen[i];
            int j = i;
            while (j > 0 && dosen[j - 1].usia < temp.usia) {
                dosen[j] = dosen[j - 1];
                j--;
            }
            dosen[j] = temp;
        }
    }

    //sequential search berdasarkan nama 
     String PencarianDataSequential(String name) {
        String hasil = "";
        int count = 0; 

        for (int i = 0; i < idx; i++) {
            if (dosen[i].nama.equals(name)) {
                if (count == 0) { 
                    hasil = dosen[i].nama; 
                } else { 
                    hasil = hasil + ", " + dosen[i].nama; 
                }
                count++;
            }
        }

        if (count == 0) {
            return "Data tidak ditemukan";
        } else if (count > 1) {
            return "Peringatan! Ditemukan lebih dari satu hasil: " + hasil;
        } else {
            return "Hasil ditemukan: " + hasil;
        }
        
    }

    //binary search berdasarkan umur 
    String PencarianDataBinary05(int age) {
        String nama = "";
        int left = 0;
        int right = idx - 1;
        int count = 0;  
    
        while (left <= right) {
            int mid = (left + right) / 2;
            if (dosen[mid].usia == age) {
                nama = dosen[mid].nama;
                count++;
    
                // Cek ke kiri 
                int i = mid - 1;
                while (i >= 0 && dosen[i].usia == age) {
                    nama = dosen[i].nama + ", " + nama;
                    count++;
                    i--;
                }
    
                // Cek ke kanan 
                int j = mid + 1;
                while (j < idx && dosen[j].usia == age) {
                    nama = nama + ", " + dosen[j].nama;
                    count++;
                    j++;
                }
                break;
            } else if (dosen[mid].usia < age) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    
        // Aturan peringatan
        if (count == 0) {
            return "Data tidak ditemukan.";
        } else if (count > 1) {
            return "Peringatan! Ditemukan lebih dari satu hasil: " + nama;
        } else {
            return "Hasil ditemukan: " + nama;
        }
    }
}
