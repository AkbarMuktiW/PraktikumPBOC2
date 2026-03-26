/* Nama File : MBangunDatar.java
 * Deskripsi : berisi main untuk menjaalankan class BangunDatar, Persegi, Lingkaran
 * Pembuat : Akbar Mukti Wibowo 
 * Tanggal : 26 Maret 2026
 */

public class MBangunDatar {
    public static void main(String[] args) {
        // ================= PERSEGI =================
        BangunDatar persegi = new Persegi(10, "Merah", "Hitam");
        System.out.println("Luas : " + persegi.getLuas());
        System.out.println("Keliling : " + persegi.getKeliling());
        System.out.println("Diagonal : " + ((Persegi) persegi).getDiagonal());

        // ================ LINGKARAN ==============
        BangunDatar lingkaran = new Lingkaran(7, "Merah", "Hitam");
        System.out.println("\nLingkaran");
        System.out.println("Jari-jari : " + ((Lingkaran) lingkaran).getJari());
        System.out.println("Luas : " + lingkaran.getLuas());
        System.out.println("Keliling : " + lingkaran.getKeliling());

        // ============== OBJEK BARU ================
        BangunDatar P1 = new Persegi(10, "Merah", "Biru");
        System.out.println("\nLuas P1 : " + P1.getLuas());

        BangunDatar L1 = new Lingkaran(5, "Biru", "Hitam");
        System.out.println("Luas L1 : " + L1.getLuas());

        // =============== PERBANDINGAN =================
        BangunDatar P2 = new Persegi(5, "Kuning", "Kuning");
        BangunDatar L2 = new Lingkaran(5, "Biru", "Hitam");

        System.out.println("\nLuas P1 == L2 ? : " + (P1.getLuas() == L2.getLuas()));
        System.out.println("Keliling P1 == L1 ? : " + (P1.getKeliling() == L1.getKeliling()));

        System.out.println("\nLuas P1 == P2 ? : " + (P1.getLuas() == P2.getLuas()));
        System.out.println("Keliling P1 == P2 ? : " + (P1.getKeliling() == P2.getKeliling()));

        // ================= IRESIZE ====================
        // Persegi
        System.out.println("\nSisi P1 sebelum zoom in : " + ((Persegi) P1).getSisi());
        ((Persegi)P1).zoomIn();
        System.out.println("Sisi P1 setelah zoom in : " + ((Persegi) P1).getSisi());

        System.out.println("Luas P1 setelah zoom in : " + ((Persegi) P1).getLuas());
        System.out.println("Keliling P1 setelah zoom in : " + ((Persegi) P1).getKeliling());

        // Lingkaran
        System.out.println("\nJari L1 sebelum zoom in : " + ((Lingkaran) L1).getJari());
        ((Lingkaran)L1).zoomIn();
        System.out.println("Jari L1 setelah zoom in : " + ((Lingkaran) L1).getJari());

        System.out.println("Luas L1 setelah zoom in : " + ((Lingkaran) L1).getLuas());
        System.out.println("Keliling L1 setelah zoom in : " + ((Lingkaran) L1).getKeliling());
    }
}