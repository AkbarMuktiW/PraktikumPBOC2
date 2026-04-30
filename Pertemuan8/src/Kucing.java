/* Nama file  : Kucing.java
   Deskripsi  :berisi atribut dan method dari class Kucing
   pembuat : Akbar Mukti Wibowo/24060124130063
   tanggal : 30 April 2026
 */

public class Kucing extends Anabul{
    // ATRIBUT
    protected double bobot;

    // KONSTRUKTOR
    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    // GETTER SETTER
    public void setBobot(double bobot) {
        this.bobot = bobot;

    }

    public double getBobot() {
        return this.bobot;
    }

    // METHOD
     public void Gerak() {
        System.out.println(super.getNama() + " Melata");
    }
    
    public void Bersuara() {
        System.out.println(super.getNama() + " meong");

    }

    public void printBobot() {
        System.out.println(this.getBobot());
    }
}