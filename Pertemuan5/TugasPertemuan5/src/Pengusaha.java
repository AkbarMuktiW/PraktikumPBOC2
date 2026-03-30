import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements IPajak {
    /* ATRIBUT */
    private String npwp;
    private static int counterPengusaha;

    /* KONSTRUKTOR */
    //dengan parameter alamat
    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    //tanpa parameter alamat
    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    /* GETTER SETTER */
    public String getNpwp() {
        return npwp;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha++;
    }

    /* METHOD */
    //nim=24060124130063
    @Override
    public int hitungMasaKerja() {
        Period masaKerja = Period.between(tgl_mulai_kerja, LocalDate.now());
        return masaKerja.getYears() + 6;
    }

    @Override
    public double hitungPajak() {
        return 0.15 * this.pendapatan;
    }

    @Override
    public void cetakInfo() {
        System.out.println("===== INFO PENGUSAHA =====");
        super.cetakInfo();
        System.out.println("NPWP            : " + this.npwp);
        System.out.println();
    }
}
