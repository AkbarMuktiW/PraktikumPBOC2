/* Nama File : DosenTetap.java
   Deskripsi : Berisi atribut dan method class DosenTetap
   Pembuat : Akbar Mukti Wibowo
   Tanggal : 17 Maret 2026
*/

import java.time.LocalDate;
import java.time.Period;

public class DosenTetap extends Dosen {
    /* ATRIBUT */
    private String nidn;
    private static final int BUP = 65;

    /* METHOD */
    // Konstruktor
    public DosenTetap(String nip, String nidn, String nama,
                      LocalDate tanggalLahir, LocalDate tmt,
                      double gajiPokok, String fakultas) {

        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    // Menghitung tunjangan yang didapat
    public double hitungTunjangan() {
        int masa = hitungMasaKerja().getYears();
        return 0.02 * masa * gajiPokok;
    }

    // Mengembalikan tanggal pensiun
    public LocalDate getTanggalPensiun() {
        return tanggalLahir.plusYears(BUP).plusMonths(1).withDayOfMonth(1);
    }

    // Mencetak informasi
    @Override
    public void printInfo() {
        Period p = hitungMasaKerja();
        int tahun = p.getYears();
        int bulan = p.getMonths();

        System.out.println("NIP             : " + nip);
        System.out.println("NIDN            : " + nidn);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + formatTanggal(tanggalLahir));
        System.out.println("TMT : " + formatTanggal(tmt));
        System.out.println("Jabatan         : Dosen Tetap");
        System.out.println("Fakultas        : " + fakultas);
        System.out.println("Masa Kerja      : " + tahun + " tahun " + bulan + " bulan");
        System.out.println("Tanggal Pensiun : " + formatTanggal(getTanggalPensiun()));
        System.out.println("Gaji Pokok      : " + formatRupiah(gajiPokok));
        System.out.println("Tunjangan       : 2% x " + tahun + " x " + formatRupiah(gajiPokok) + " = " + formatRupiah(hitungTunjangan()));
    }
}