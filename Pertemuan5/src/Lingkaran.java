/* Nama File : Lingkaran.java
 * Deskripsi : berisi attribut dan method dalam class Lingkaran
 * Pembuat : Akbar Mukti Wibowo 
 * Tanggal : 12 Maret 2026
 */

public class Lingkaran extends BangunDatar implements IResize {
    //===============ATRIBUT=================
    private double jari;

    //============KONSTRUKTOR================
    // tanpa parameter
    public Lingkaran() {
        setJmlSisi(1);
    }

    // dengan parameter
    public Lingkaran(double diameter, String warna, String border) {
        this.jari = diameter / 2;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(1);
    }

    //=============GETTER SETTER==============
    public double getJari() {
        return jari;
    }

    // Menentukan nilai jari jari
    public void setJari(double jari) {
        this.jari = jari;
    }

    // Mencetak luas lingkaran
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    // Mencetak keliling lingkaran
    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    //===============METHOD===============
    // @Override
    // public void printInfo() {
    //     System.out.println("Jumlah Sisi : " + getJmlSisi());
    //     System.out.println("Warna : " + getWarna());
    //     System.out.println("Border : " + getBorder());
    //     System.out.println("Jari : " + jari);
    // }

    
    //=====SUPER=====
    // Mencetak informasi lingkaran
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari jari lingkaran : " + jari);
    }
    
    @Override
    public void zoomIn() {
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut() {
        jari = jari * 0.9;
    }

    @Override
    public void zoom(int percent) {
        jari = jari * percent/100;
    }
}