import java.time.LocalDate;

public abstract class Manusia {
    /* ATRIBUT */
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns;

    /* KONSTRUKTOR */
    //dengan parameter alamat
    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    //tanpa parameter alamat
    public Manusia(String nama, LocalDate tgl_mulai_kerja, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    /* GETTER SETTER */
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public LocalDate getTglMulaiKerja() {
        return tgl_mulai_kerja;
    }

    public void setTglMulaiKerja(LocalDate tgl_mulai_kerja) {
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public double getPendapatan() {
        return pendapatan;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    public static void counterMns(int counterMns) {
        Manusia.counterMns = counterMns;
    }

    /* METHOD */
    public void cetakInfo() {
        System.out.println("Nama                : " + this.nama);
        System.out.println("Tanggal mulai kerja : " + this.tgl_mulai_kerja);
        System.out.println("Alamat              : " + this.alamat);
        System.out.println("Pendapatan          : Rp." + this.pendapatan);
    }

    public abstract int hitungMasaKerja();
}
