/* Nama File : BangunDatar.java
 * Deskripsi : berisi attribut dan method dalam class BangunDatar
 * Pembuat : Akbar Mukti Wibowo 
 * Tanggal : 12 Maret 2026
 */

public abstract class BangunDatar {
    // =============ATRIBUT================
    private int jmlSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;

    //=============KONSTRUKTOR=============
    // tanpa parameter
    public BangunDatar() {
        counterBangunDatar++;
    }

    // dengan parameter
    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    
    //=============GETTER SETTER=================
    public int getJmlSisi() {
        return jmlSisi;
    }
    
    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }
    
    public String getWarna() {
        return warna;
    }
    
    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    public String getBorder() {
        return border;
    }
    
    public void setBorder(String border) {
        this.border = border;
    }
    
    //=============METHOD===============

    public abstract double getLuas();
    public abstract double getKeliling();

    public boolean isEqualLuas(BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X) {
        return this.getKeliling() == X.getKeliling();
    }

    // Mencetak informasi bangun datar
    public void printInfo() {
        System.out.println("Jumlah Sisi : " + jmlSisi);
        System.out.println("Warna : " + warna);
        System.out.println("Border : " + border);
    }

    // Mengeluarkan jumlah bangun datar yang dibuat
    public static void printCounterBangunDatar() {
        System.out.println("Jumlah objek bangun datar : " + counterBangunDatar);
    }
}
