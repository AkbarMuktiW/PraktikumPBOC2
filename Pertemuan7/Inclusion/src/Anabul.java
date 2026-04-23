/* Nama File : Anabul.java
 * Deskripsi : Berisi parent class Anabul lengkap dengan 
               atribut, konstruktor, getter setter, method
 * Pembuat : Akbar Mukti Wibowo/24060124130063
 * Tanggal : 23 April 2026
 */

public class Anabul {
    //ATRIBUT
    String nama;

    //KONSTRUKTOR
    Anabul() {
        this.nama = "";
    }

    Anabul(String nama) {
        this.nama = nama;
    }

    //GETTER SETTER
    public String getNama() {
        return nama;
    }

    void setNama(String nama) {
        this.nama = nama;
    }

    //METHOD
    void gerak() {
        System.out.println(nama + " sedang bergerak");
    }

    void bersuara() {
        System.out.println(nama + " bersuara");
    }
}
