import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements IPajak{
    /* ATRIBUT */
    private String asal_kota;
    private static int counterPetani;

    /* KONSTRUKTOR */
    //dengan paramter alamat
    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapattan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapattan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    //tanpa parameter alamat
    public Petani(String nama, LocalDate tgl_mulai_kerja, double pendapattan, String asal_kota) {
        super(nama, tgl_mulai_kerja, pendapattan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    /* GETTER SETTER */
    public String getAsalKota() {
        return asal_kota;
    }

    public void setAsalKota(String asal_kota) {
        this.asal_kota = asal_kota;
    }

    public static int getCounterPetani() {
        return counterPetani++;
    }

    /* METHOD */
    //nim=24060124130063
    @Override
    public int hitungMasaKerja() {
        Period masaKerja = Period.between(tgl_mulai_kerja, LocalDate.now());
        return masaKerja.getYears() + 0;
    }

    @Override
    public double hitungPajak() {
        return 0;
    }

    @Override
    public void cetakInfo() {
        System.out.println("===== INFO PETANI =====");
        super.cetakInfo();
        System.out.println("Asal Kota       : " + this.asal_kota);
        System.out.println();
    }
}
