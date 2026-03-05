/* Nama File : MataKuliah.java
 * Deskripsi : berisi attribut dan method dalam class Mahasiswa
 * Pembuat : Akbar Mukti Wibowo 
 * Tanggal : 6 Maret 2026
 */

public class MataKuliah {
    /*=============ATRIBUT=========== */
    private String idMatKul;
    private String nama;
    private int sks;

    /*==========KONSTRUKTOR============= */
    public MataKuliah() {
        this.idMatKul = "";
        this.nama = "";
        this.sks = 0;
    }

    public MataKuliah(String idMatKul, String nama, int sks) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    /*=========GETTER SETTER========== */
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }    

    public String getId() {
        return idMatKul;
    }

    public void setId(String idMatKul) {
        this.idMatKul = idMatKul;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }
}
