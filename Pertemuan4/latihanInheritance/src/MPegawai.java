/* Nama File : MPegawai.java
   Deskripsi : Berisi implementasi dari class Pegawai, Dosen, DosenTetap, DosenTamu, Pegawai, Tendik
   Pembuat : Akbar Mukti Wibowo
   Tanggal : 17 Maret 2026
*/

import java.time.LocalDate;

public class MPegawai {
    public static void main(String[] args) {
        System.out.println("========= SISTEM INFORMASI KEPEGAWAIAN PERGURUAN TINGGI ==========\n");

        /* =========== DOSEN TETAP ============ */
        DosenTetap dosenTetap = new DosenTetap(
                "261354849",
                "521463158",
                "JOKO",
                LocalDate.of(1972, 2, 5),
                LocalDate.of(2015, 1, 1),
                5_000_000,
                "Fakultas KEDOKTERAN"
        );

        /* ======== DOSEN TAMU =============== */
        DosenTamu dosenTamu = new DosenTamu(
                "854623145",
                "96548215",
                "PRABO",
                LocalDate.of(1978, 4, 21),
                LocalDate.of(2022, 2, 2),
                4_500_000,
                "Fakultas Teknik",
                LocalDate.of(2027, 12, 31)
        );

        /* ============== TENDIK ================== */
        Tendik tendik = new Tendik(
                "1978123456",       
                "MEGA",
                LocalDate.of(1990, 8, 15),
                LocalDate.of(2019, 5, 4),
                4_000_000,
                "Kurikulum"
        );

        /* ==================== OUTPUT ================== */
        System.out.println("========== INFORMASI DOSEN TETAP ==========");
        dosenTetap.printInfo();

        System.out.println("\n========== INFORMASI DOSEN TAMU ==========");
        dosenTamu.printInfo();

        System.out.println("\n========== INFORMASI TENDIK ==========");
        tendik.printInfo();

        System.out.println();
    }
}
