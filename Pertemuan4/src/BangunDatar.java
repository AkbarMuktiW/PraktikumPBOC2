/* Nama File : BangunDatar.java
 * Deskripsi : berisi attribut dan method dalam class BangunDatar
 * Pembuat : Akbar Mukti Wibowo 
 * Tanggal : 12 Maret 2026
 */

public class BangunDatar {
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
