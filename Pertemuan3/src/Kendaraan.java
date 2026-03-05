/* Nama File : Kendaraan.java
 * Deskripsi : berisi attribut dan method dalam class Kendaraan
 * Pembuat : Akbar Mukti Wibowo 
 * Tanggal : 6 Maret 2026
 */

public class Kendaraan {
    /*==========ATRIBUT============ */
    private String noPlat;
    private String jenis;

    /*==========KONSTRUKTOR=========== */
    /*tanpa parameter */
    public Kendaraan() {
        this.noPlat = "";
        this.jenis = "";
    }

    /*dengan parameter */
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    /*==========GETTER SETTER========= */
    public String getNoPlat() {
        return noPlat;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}