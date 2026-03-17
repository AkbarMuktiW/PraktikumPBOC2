/* Nama File : Pegawai.java
   Deskripsi : Berisi atribut dan method class Pegawai
   Pembuat : Akbar Mukti Wibowo
   Tanggal : 17 Maret 2026
*/

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.text.NumberFormat;

public class Pegawai {
    /* ATRIBUT */
    protected String nip;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate tmt;
    protected double gajiPokok;

    /* METHOD */
    // Konstruktor
    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    // Menghitung masa kerja
    protected Period hitungMasaKerja() {
        return Period.between(tmt, LocalDate.now());
    }

    // Membuat format tanggal
    protected String formatTanggal(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.forLanguageTag("id-ID"));
        return date.format(formatter);
    }

    // Membuat format masa kerja
    protected String formatMasaKerja(Period p) {
        return p.getYears() + " tahun " + p.getMonths() + " bulan";
    }

    // Membuat format rupiah
    protected String formatRupiah(double nominal) {
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        return formatRupiah.format(nominal);
    }

    // Mencetak informasi
    public void printInfo() {
        System.out.println("NIP             : " + nip);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + formatTanggal(tanggalLahir));
        System.out.println("TMT             : " + formatTanggal(tmt));
        System.out.println("Gaji Pokok      : " + formatRupiah(gajiPokok));
    }
}