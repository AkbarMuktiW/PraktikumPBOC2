/* Nama file  : OperatorGenerik.java
   Deskripsi  :berisi atribut dan method dari class OperatorGenerik
   pembuat : Akbar Mukti Wibowo/24060124130063
   tanggal : 30 April 2026
 */

public class OperatorGenerik {

    public static <T> void Tukar(Datum<T> a, Datum<T> b) {
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }
}