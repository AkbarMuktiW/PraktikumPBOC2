/* Nama File : Tendik.java
   Deskripsi : Berisi atribut dan method class Tendik
   Pembuat : Akbar Mukti Wibowo
   Tanggal : 17 Maret 2026
*/

import java.time.LocalDate;
import java.time.Period;

public class Tendik extends Pegawai {
    /* ATRIBUT */
    private String bidang;
    private static final int BUP = 55;

    /* METHOD */
    // Konstruktor
    public Tendik(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String bidang) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    // Menghitung tunjangan yang didapat
    public double hitungTunjangan() {
        int masa = hitungMasaKerja().getYears();
        return 0.01 * masa * gajiPokok;
    }

    // Mengembalikan tanggal pensiun
    public LocalDate getTanggalPensiun() {
        return tanggalLahir.plusYears(BUP).plusMonths(1).withDayOfMonth(1);
    }

    // Mencetak informasi
    @Override
    public void printInfo() {
        Period p = hitungMasaKerja();

        System.out.println("NIP             : " + nip);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + formatTanggal(tanggalLahir));
        System.out.println("TMT : " + formatTanggal(tmt));
        System.out.println("Jabatan         : Tendik");
        System.out.println("Bidang          : " + bidang);
        System.out.println("Masa Kerja      : " + formatMasaKerja(p));
        System.out.println("Tanggal Pensiun : " + formatTanggal(getTanggalPensiun()));
        System.out.println("Gaji Pokok      : " + formatRupiah(gajiPokok));
        System.out.println("Tunjangan       : 1% x " + p.getYears() + " x " + formatRupiah(gajiPokok) + " = " + formatRupiah(hitungTunjangan()));
    }
}