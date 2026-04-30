/* Nama File    : Mahasiswa.java 
 * Deskripsi    : Berisi atribut dan method dari class Mahasiswa
 * Pembuat      : Akbar Mukti Wibowo/24060124130063
 * Tanggal      : 23 April 2026
 */

public class Mahasiswa extends CivitasAkademika {
    // ATRIBUT
    private String NIM;
    private Dosen Doswal;

    // KONSTRUKTOR
    public Mahasiswa() {
        super("");
        NIM = "";
        Doswal = new Dosen("", "");
    }

    public Mahasiswa(String nama,String NIM, Dosen Doswal) {
        super(nama);
        this.NIM = NIM;
        this.Doswal = Doswal;
    }

    // GETTER SETTER
    public Dosen getDoswal() {
        return Doswal;
    }
    public void setDoswal(Dosen Doswal) {
        this.Doswal = Doswal;
    }

    public void setNim(String NIM) {
        this.NIM = NIM;
    }
    @Override
    public String getNomor() {
        return NIM;
    }

    // METHOD
    public void tampilDataMahasiswa(){
        System.out.println("Nama        : " + getNama());
        System.out.println("NIM         : " + getNomor());
        System.out.println("Dosen Wali  : " + Doswal.getNama());
        System.out.println("================================");
    }
    
}