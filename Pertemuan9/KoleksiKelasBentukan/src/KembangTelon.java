/* Nama file  : Kembangtelon.java
   Deskripsi  :berisi atribut dan method dari class Kembangtelon
   pembuat : Akbar Mukti Wibowo/24060124130063
   tanggal : 30 April 2026
 */

public class KembangTelon extends Kucing {
    // KONSTRUKTOR
    public KembangTelon(String nama, double bobot) {
        super(nama, bobot);
    }

    // METHOD
    @Override
     public void Gerak() {
        System.out.println(super.getNama() + " lincah melompat");
    }
    
    public void Bersuara() {
        System.out.println(super.getNama() + " bersuara : Meong lembut");

    }
}