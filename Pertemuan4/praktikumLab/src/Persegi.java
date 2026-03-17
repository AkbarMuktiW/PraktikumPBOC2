/* Nama File : Persegi.java
 * Deskripsi : berisi attribut dan method dalam class Persegi
 * Pembuat : Akbar Mukti Wibowo 
 * Tanggal : 12 Maret 2026
 */

public class Persegi extends BangunDatar{
    //===============ATRIBUT==============
    private double sisi;

    //===============KONSTRUKTOR==============
    // tanpa parameter 
    public Persegi() {
        setJmlSisi(4);
    }

    // dengan parameter
    public Persegi(double sisi, String warna, String border) {
        super(4,warna,border);
        this.sisi = sisi;
        // this.sisi = sisi;
        // setWarna(warna);
        // setBorder(border);
        // setJmlSisi(4);
    }

    //================GETTER SETTER===============
    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    // Mencetak luas dari persegi
    public double getLuas() {
        return sisi * sisi;
    }

    // Mencetak keliling persegi
    public double getKeliling() {
        return 4 * sisi;
    }

    // Mencetak diagonal persegi
    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    //==================METHOD=============
    // Mencetak informasi persegi
    @Override
    public void printInfo() {
        System.out.println("Jumlah Sisi : " + getJmlSisi());
        System.out.println("Warna : " + getWarna());
        System.out.println("Border : " + getBorder());
        System.out.println("Sisi : " + sisi);
    }

    // //super
    // public void printInfo() {
    //     super.printInfo();
    //     System.out.println("sisi : " + sisi);
    // }
}
