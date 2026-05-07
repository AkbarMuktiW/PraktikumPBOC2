/* Nama file  : Anabul.java
   Deskripsi  :berisi atribut dan method dari class Anabul
   pembuat : Akbar Mukti Wibowo/24060124130063
   tanggal : 30 April 2026
 */

public class Anabul {
    // ATRIBUT
    private String nama;
    
    // KONSTRUKTOR
    public Anabul(){
        this.nama = "";
    }
    public Anabul(String nama){
        this.nama = nama;
    }

    // GETTER SETTER
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    // METHOD
    public void Gerak() {
        System.out.println("Anabul " + nama + "bergerak" );
    }
        
    public void Bersuara() {
        System.out.println("Anabul " + nama + "bersuara" );
    }
}