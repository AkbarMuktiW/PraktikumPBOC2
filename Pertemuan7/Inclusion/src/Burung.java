/* Nama File : Burung.java
 * Deskripsi : Berisi child class Burung lengkap dengan 
               konstruktor dan method
 * Pembuat : Akbar Mukti Wibowo/24060124130063
 * Tanggal : 23 April 2026
 */

public class Burung extends Anabul {
    //KONSTRUKTOR
    Burung() {
        this.nama = "";
    }
    
    Burung(String nama) {
        super(nama);
    }

    //METHOD
    @Override
    void gerak() {
        System.out.println("Burung" + nama + " bergerak terbang");
    }

    @Override
    void bersuara() {
        System.out.println("Burung" + nama + " berbunyi cuit cuit cuit");
    }
}