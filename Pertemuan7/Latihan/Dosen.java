/* Nama File    : Dosen.java 
 * Deskripsi    : Berisi atribut dan method dari class Dosen
 * Pembuat      : Akbar Mukti Wibowo/24060124130063
 * Tanggal      : 23 April 2026
 */


public class Dosen extends CivitasAkademika {
    // ATRIBUT
    private String NIP;

    // METHOD
    // KONSTRUKTOR
    public Dosen() {
        super("");
        NIP = "";
    }

    public Dosen(String nama, String NIP) {
        super(nama);
        this.NIP = NIP;
    }

    // Setter dan Getter
    public void setNip(String NIP) {
        this.NIP = NIP;
    }

    @Override
    public String getNomor() {
        return NIP;
    }
}