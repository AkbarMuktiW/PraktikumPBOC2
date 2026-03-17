/* Nama File : Dosen.java
   Deskripsi : Berisi atribut dan method class Dosen
   Pembuat : Akbar Mukti Wibowo
   Tanggal : 17 Maret 2026
*/

import java.time.LocalDate;

public class Dosen extends Pegawai {
    /* ATRIBUT */
    protected String fakultas;

    /* METHOD */
    // Konstruktor
    public Dosen(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }
}