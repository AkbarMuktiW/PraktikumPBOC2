/* Nama file  : Anjing.java
   Deskripsi  : berisi atribut dan method dari class Anjing
   pembuat    : Akbar Mukti Wibowo/24060124130063
   tanggal    : 30 April 2026
 */

public class Anjing extends Anabul {

    // KONSTRUKTOR
    public Anjing(String nama) {
        super(nama);
    }

    // METHOD
    public void Gerak() {
        System.out.println(super.getNama() + " berlari");
    }

    public void Bersuara() {
        System.out.println(super.getNama() + " menggonggong");
    }
}