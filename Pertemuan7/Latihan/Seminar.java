/* Nama File    : Mahasiswa.java 
 * Deskripsi    : Berisi atribut dan method dari class Mahasiswa
 * Pembuat      : Akbar Mukti Wibowo/24060124130063
 * Tanggal      : 23 April 2026
 */

public class Seminar {
    // ATRIBUT
    CivitasAkademika[] pesertas = new CivitasAkademika[100];
    private int banyakPeserta = 0;

    // KONSTRUKTOR
    public Seminar() {
        banyakPeserta = 0;
    }

    // GETTER
    public int countPeserta(){
        return banyakPeserta;
    }

    // METHOD
    public int countMahasiswa(){
        int count = 0;
        for(int i = 0; i < banyakPeserta; i++){
            if(pesertas[i] instanceof Mahasiswa){
                count++;
            }
        }
        return count;
    }

    public void registrasi(CivitasAkademika peserta){
        if (banyakPeserta < pesertas.length) {
            pesertas[banyakPeserta] = peserta;
            banyakPeserta++;
        } else {
            System.out.println("Kapasitas seminar sudah penuh.");
        }
    }

    public void tampilPeserta(){
        System.out.println("Daftar Peserta Seminar:");
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println("Nomor : " + pesertas[i].getNomor() + ", Nama : " + pesertas[i].getNama());
        }
    }
}