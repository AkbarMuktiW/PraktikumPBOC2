/* Nama File : AngkaSialException.java
 * Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13!
 * Pembuat : Akbar Mukti Wibowo/24060124130063
 * Tanggal : 26 Maret 2026
 */

/* File        : AngkaSialException.java
 * Deskripsi   : Eksepsi buatan sendiri, menolak masukan angka 13!
 */

public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}