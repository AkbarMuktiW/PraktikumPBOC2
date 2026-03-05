/* Nama File : Dosen.java
 * Deskripsi : berisi attribut dan method dalam class Dosen
 * Pembuat : Akbar Mukti Wibowo 
 * Tanggal : 6 Maret 2026
 */

public class Dosen {
    /*=============ATRIBUT=========== */
    private String nip;
    private String nama;
    private String prodi;

    /*============KONSTRUKTOR===========*/
    /*tanpa parameter */
    public Dosen() {
        this.nama = "";
        this.nip = "";
        this.prodi = "";
    }

    /*dengan parameter */
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    /*=========GETTER SETTER=========== */
    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
}