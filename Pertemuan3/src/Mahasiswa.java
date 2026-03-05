/* Nama File : Mahasiswa.java
 * Deskripsi : berisi attribut dan method dalam class Mahasiswa
 * Pembuat : Akbar Mukti Wibowo 
 * Tanggal : 6 Maret 2026
 */

import java.util.ArrayList;

public class Mahasiswa {
    /*=============ATRIBUT========== */
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    public Dosen dosenWali;
    public Kendaraan kendaraan;

    /*=============KONSTRUKTOR========== */
    /*tanpa parameter */
    public Mahasiswa() {
        this.listMatkul = new ArrayList<>();
    }

    /*dengan parameter */
    public Mahasiswa(String nim ,String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    /*=============GETTER SETTER=========== */
    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getProdi() {
        return prodi;
    }

    /*============METHOD============ */
    /*Menambah matkul dalam list matkul */
    public void addMatKul (MataKuliah newMatkul) {
        listMatkul.add(newMatkul);
    }

    /*Mencetak informasi mahasiswa */
    public void printMhs() {
        System.out.println ("Nim: " + nim);
        System.out.println ("Nama: " + nama) ;
        System.out.println ("Prodi: " + prodi);
        int i;
        for(i=0; i < listMatkul.size () ; i++) {
            System.out.println(listMatkul.get(i).getNama());
        }
    }

    /*Mengembalikan jumlah sks yg diambil dari semua matkul yang dipilih mahasiswa */
    public int getJumlahSks() {
        int i;
        int jml = 0;
        for(i=0; i < listMatkul.size(); i++) {
            jml = jml + listMatkul.get(i).getSks();
        }
        return jml;
    }

    /*Mengembalikan jumlah matkul yang diambil mahasiswa */
    public int getJumlahMatkul() {
        return listMatkul.size();
    }

    //Menampilkan detail mahasiswa
    public void printDetailMhs() {
        printMhs();
        System.out.println("\nDosen Wali: " + dosenWali.getNama());
        System.out.println("Kendaraan: " + kendaraan.getJenis() + " - " + kendaraan.getNoPlat());
        System.out.println("\nDaftar Mata Kuliah:");
        for (int i = 0; i < getJumlahMatkul(); i++) {
            System.out.println("- " + listMatkul.get(i).getNama() + " (" + listMatkul.get(i).getSks() + " SKS)");
        }
        System.out.println("\nTotal SKS: " + getJumlahSks());
    }
}
