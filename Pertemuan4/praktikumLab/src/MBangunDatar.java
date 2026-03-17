/* Nama File : BangunDatar.java
 * Deskripsi : berisi main untuk menjaalankan class BangunDatar, Persegi, Lingkaran
 * Pembuat : Akbar Mukti Wibowo 
 * Tanggal : 12 Maret 2026
 */

public class MBangunDatar {
    public static void main(String[] args) {
        //======================BANGUN DATAR======================
        System.out.println("=============BANGUNDATAR=============");
        // konstruktor kosong
        BangunDatar bd1 = new BangunDatar();
        System.out.println("Bangun Datar 1");
        bd1.printInfo();

        System.out.println();

        // Mengubah nilai menggunakan setter
        bd1.setJmlSisi(4);
        bd1.setWarna("Merah berdarah");
        bd1.setBorder("Hitam");
        System.out.println("Bangun Datar 1 setelah diubah");
        bd1.printInfo();

        System.out.println();

        // konstruktor berparameter
        BangunDatar bd2 = new BangunDatar(3, "Biru", "Putih");
        System.out.println("Bangun Datar 2");
        bd2.printInfo();

        System.out.println();
        BangunDatar.printCounterBangunDatar();
        //=======================PERSEGI====================
        System.out.println("\n============PERSEGI=============");
        // konstruktor kosong
        Persegi p1 = new Persegi();
        p1.setSisi(5);
        p1.setWarna("Biru dont care");
        p1.setBorder("Hitam");

        System.out.println("Persegi 1");
        // p1.printInfo();
        System.out.println("Panjang sisi : " + p1.getSisi());
        System.out.println("Luas persegi : " + p1.getLuas());
        System.out.println("Keliling persegi : " + p1.getKeliling());
        System.out.println("Diagonal persegi : " + p1.getDiagonal());

        System.out.println();

        // konstruktor berparameter
        Persegi p2 = new Persegi(10, "Biru", "Putih");
        System.out.println("Persegi 2");
        // p2.printInfo();
        System.out.println("Panjang sisi : " + p2.getSisi());
        System.out.println("Luas persegi : " + p2.getLuas());
        System.out.println("Keliling persegi : " + p2.getKeliling());
        System.out.println("Diagonal persegi : " + p2.getDiagonal());

        //===================LINGKARAN=========================
        System.out.println("\n=============LINGKARAN===============");
        // konstruktor kosong
        Lingkaran l1 = new Lingkaran();
        l1.setJari(6);
        l1.setWarna("Ijo royo royo");
        l1.setBorder("nyoklat");

        l1.printInfo();
        // System.out.println("Jari jari : " + l1.getJari());
        // System.out.println("Luas lingkaaran : " + l1.getLuas());
        // System.out.println("Keliling lingkaran : " + l1.getKeliling());

        System.out.println();
        // konstruktor berparameter
        Lingkaran l2 = new Lingkaran(8, "Putih suci", "Kuning kunyit");
        l2.printInfo();
        // System.out.println("Jari jari : " + l2.getJari());
        // System.out.println("Luas lingkaaran : " + l2.getLuas());
        // System.out.println("Keliling lingkaran : " + l2.getKeliling());
    }
}