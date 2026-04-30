/* Nama file  : Data.java
   Deskripsi  : berisi atribut dan method dari class Data
   pembuat    : Akbar Mukti Wibowo/24060124130063
   tanggal    : 30 April 2026
 */

import java.util.Arrays;

public class Data<T> {
    // ATRIBUT
    private static final int KAPASITAS = 100;
    private final T[] ruang;
    private static int banyak;

    // KONSTRUKTOR
    public Data(T[] contohRuang) {
        this.ruang = Arrays.copyOf(contohRuang, KAPASITAS);
        banyak = 0;
    }

    // GETTER SETTER
    public T getIsi(int posisi) {
        return ruang[posisi - 1];
    }

    public void setIsi(int posisi, T objek) {
        if (ruang[posisi] == null) {
            banyak++;
        }

        ruang[posisi - 1] = objek;
    }

    public int getSize() {
        return banyak;
    }
}
