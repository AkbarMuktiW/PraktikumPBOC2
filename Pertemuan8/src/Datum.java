/* Nama file  : Datum.java
   Deskripsi  :berisi atribut dan method dari class Datum
   pembuat : Akbar Mukti Wibowo/24060124130063
   tanggal : 30 April 2026
 */

public class Datum<T> {
    // ATRIBUT
    private T isi;

    // KONSTRUKTOR
    public Datum(T isi) {
        this.isi = isi;
    }

    // GETTER SETTER
    public T getIsi() {
        return isi;
    }

    public void setIsi(T isiBaru) {
        this.isi = isiBaru;
    }

    // METHOD
    public void tampilkanAnabul(Anabul anabul) {
        anabul.Gerak();
        anabul.Bersuara();

        if (anabul instanceof Kucing) {
            ((Kucing) anabul).printBobot();
        }
    }
}