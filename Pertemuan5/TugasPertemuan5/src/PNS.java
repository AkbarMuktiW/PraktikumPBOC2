import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements IPajak{
    /* ATRIBUT */
    private String nip;
    private static int counterPNS;

    /* KONSTRUKTOR */
    //dengan parameter alamat
    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    //tanpa parameter alamat
    public PNS(String nama, LocalDate tgl_mulai_kerja, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    /* GETTER SETTER */
    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public static int getCounterPNS() {
        return counterPNS++;
    }

    /* METHOD */
    //nim= 24060124130063
    @Override
    public int hitungMasaKerja() {
        Period masaKerja = Period.between(tgl_mulai_kerja, LocalDate.now());
        return masaKerja.getYears() + 3;
    }

    @Override
    public double hitungPajak() {
        return 0.1 * this.pendapatan;
    }

    @Override
    public void cetakInfo() {
        System.out.println("===== INFO PNS =====");
        super.cetakInfo();
        System.out.println("NIP         : " + this.nip);
        System.out.println();
    }
}
