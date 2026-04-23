/* Nama File : Anjing.java
 * Deskripsi : Berisi child class Anjing lengkap dengan 
               konstruktor dan method
 * Pembuat : Akbar Mukti Wibowo/24060124130063
 * Tanggal : 23 April 2026
 */


public class Anjing extends Anabul {
    //KONSTRUKTOR
    Anjing() {
        this.nama = "";
    }
    
    Anjing(String nama) {
        super(nama);
    }

    //METHOD
    @Override
    void gerak() {
        System.out.println("Anjing" + nama + " bergerak melata");
    }

    @Override
    void bersuara() {
        System.out.println("Anjing" + nama + " berbunyi guk guk guk");
    }
}
