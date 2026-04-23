/* Nama File : Mahasiswa.java
 * Deskripsi : Berisi class Mahasiswa lengkap dengan 
               atribut, konstruktor,setter, dan method
 * Pembuat : Akbar Mukti Wibowo/24060124130063
 * Tanggal : 23 April 2026
 */

class Mahasiswa {
    //ATRIBUT
    String nim;
    String nama;
    String programStudi;

    //KONSTRUKTOR
    Mahasiswa() {
        this.nim = "999";
        this.nama = "n/a";
        this.programStudi = "n/a";
    }

    Mahasiswa(String nim, String nama, String programStudi) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
    }

    Mahasiswa(Mahasiswa mhs) {
        this.nim = mhs.nim;
        this.nama = mhs.nama;
        this.programStudi = mhs.programStudi;
    }

    //SETTER
    //tanpa parameter
    void setProgramStudi() {
        this.programStudi = "Kosong";
    }

    //parameter String
    void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }

    //cloning
    //parameter objek Mahasiswa
    void setProgramStudi(Mahasiswa mhs) {
        this.programStudi = mhs.programStudi;
    }

    //METHOD
    void tampil() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Program Studi: " + programStudi);
    }
}