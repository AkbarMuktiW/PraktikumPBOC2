/* Nama File : DosenTamu.java
   Deskripsi : Berisi atribut dan method class DosenTamu
   Pembuat : Akbar Mukti Wibowo
   Tanggal : 17 Maret 2026
*/

import java.time.LocalDate;

public class DosenTamu extends Dosen {
    /* ATRIBUT */
    private String nidk;
    private LocalDate tanggalAkhirKontrak;

    /* METHOD */
    // Konstruktor
    public DosenTamu(String nip, String nidk, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, LocalDate tanggalAkhirKontrak) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tanggalAkhirKontrak = tanggalAkhirKontrak;
    }

    // Menghitung tunjangan yang didapat
    public double hitungTunjangan() {
        return 0.025 * gajiPokok;
    }

    // Mencetak informasi dari DosenTamu
    @Override
    public void printInfo() {
        System.out.println("NIP             : " + nip);
        System.out.println("NIDK            : " + nidk);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + formatTanggal(tanggalLahir));
        System.out.println("TMT: " + formatTanggal(tmt));
        System.out.println("Jabatan         : Dosen Tamu");
        System.out.println("Fakultas        : " + fakultas);
        System.out.println("Akhir Kontrak   : " + formatTanggal(tanggalAkhirKontrak));
        System.out.println("Gaji Pokok      : " + formatRupiah(gajiPokok));
        System.out.println("Tunjangan       : 2.5% x " + formatRupiah(gajiPokok) + " = " + formatRupiah(hitungTunjangan()));
    }
}