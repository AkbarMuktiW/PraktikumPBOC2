/* Nama File : Kucing.java
 * Deskripsi : Berisi child class Kucing lengkap dengan 
               konstruktor dan method
 * Pembuat : Akbar Mukti Wibowo/24060124130063
 * Tanggal : 23 April 2026
 */

public class Kucing extends Anabul {
    //KONSTRUKTOR
    Kucing() {
        this.nama = "";
    }

    Kucing(String nama) {
        super(nama);
    }

    //METHOD
    @Override
    void gerak() {
        System.out.println("Kucing" + nama + " bergerak dengan melata");
    }

    @Override
    void bersuara() {
        System.out.println("Kucing" + nama + " berbunyi meong meong meong");
    }
}