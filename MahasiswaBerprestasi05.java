    public class MahasiswaBerprestasi05 {
        Mahasiswa05 [] listMhs = new Mahasiswa05[5];
        int idx;


        void tambah(Mahasiswa05 mhs){
            if (idx < listMhs.length){
                listMhs[idx] = mhs;
                idx++;
            } else {
                System.out.println("Data sudah penuh");
            }
        }


        void tampil(){
            for (Mahasiswa05 mhs : listMhs){
                if (mhs != null){
                    mhs.tampilInformasi();
                    System.out.println("-------------------------------");
                }
            }
        }

        void bubbleSort(){
            for (int i=0; i<listMhs.length-1; i++){
                for (int j=1; j<listMhs.length-i; j++){
                    if (listMhs[j].ipk > listMhs[j-1].ipk){
                        //proses pertukaran
                        Mahasiswa05 tmp = listMhs[j];
                        listMhs[j] = listMhs[j-1];
                        listMhs[j-1] = tmp;
                    }
                }
            }
        }

        void selectionSort(){
            for (int i=0; i<listMhs.length-1; i++){
                int idxMin = i;
                for (int j=i+1; j<listMhs.length; j++){
                    if (listMhs[j].ipk < listMhs[idxMin].ipk){
                        idxMin = j;
                    }
                }
                //proses pertukaran
                Mahasiswa05 tmp = listMhs[idxMin];
                listMhs[idxMin] = listMhs[i];
                listMhs[i] = tmp;
            }
        }


        void insertionSort(){
            for (int i=1; i<listMhs.length; i++){
                Mahasiswa05 temp = listMhs[i];
                int j = i;
                while (j > 0 && listMhs[j-1].ipk < temp.ipk){
                    listMhs[j] = listMhs[j-1];
                    j--;
                }
                listMhs[j] = temp;
            }
        }

        //sequrntial searching 
        int sequentialSearching(double cari){
            int posisi = -1;
            for (int j = 0; j < listMhs.length; j++){
                if (listMhs[j].ipk == cari){
                    posisi = j;
                    break;
                }
            }
            return posisi;
        }

        //binary searching
        int findBinary(double cari, int left, int right){
            int mid ;
            if (right >= left){
                //proses pembagian
                mid = (left + right) / 2;
                if (cari == listMhs[mid].ipk){
                    return (mid);
                } else if (cari > listMhs[mid].ipk){
                    return findBinary(cari, left, mid - 1);
                } else {
                    return findBinary(cari, mid + 1, right);
                    
                }
            }
            return -1;
            }
    

        //tampilPosisi
        void tampilPosisi(double x, int pos){
            if (pos != -1){
                System.out.println("Data dengan IPK " + x + " ada pada index ke-" + pos);
            } else {
                System.out.println("Data dengan IPK " + x + " tidak ada");
            }
        }

        //tampilData
        void tampilDataSearch(double x, int pos){
            if (pos != -1){
                System.out.println("Data dengan IPK " + x + " ada pada index ke-" + pos);
                System.out.println("Nama : " + listMhs[pos].nama);
                System.out.println("NIM : " + listMhs[pos].nim);
                System.out.println("Kelas : " + listMhs[pos].kelas);
                System.out.println("IPK : " + listMhs[pos].ipk);
            } else {
                System.out.println("Data dengan IPK " + x + " tidak ada");
            }

        }
}

