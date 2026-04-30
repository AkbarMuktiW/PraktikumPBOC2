public class Main {
    public static void main(String[] args) {

        Seminar S1 = new Seminar();

        CivitasAkademika D1 = new Dosen("Dr. Strange", "77777");
        CivitasAkademika D2 = new Dosen("Dr. Tirta", "99999");

        CivitasAkademika M1 = new Mahasiswa("Toni", "20251301", (Dosen) D1);
        CivitasAkademika M2 = new Mahasiswa("Tono", "20251259", (Dosen) D2);
        CivitasAkademika M3 = new Mahasiswa("Tino", "20251399", (Dosen) D1);
        CivitasAkademika M4 = new Mahasiswa("Tisa", "20251295", (Dosen) D2);
        CivitasAkademika M5 = new Mahasiswa("Tasi", "20251398", (Dosen) D1);
        
        S1.registrasi(D1);
        S1.registrasi(D2);
        S1.registrasi(M1);
        S1.registrasi(M2);
        S1.registrasi(M3);
        S1.registrasi(M4);
        S1.registrasi(M5);

        S1.tampilPeserta();
        System.out.println("Jumlah peserta seminar: " + S1.countPeserta());
        System.out.println("Jumlah mahasiswa yang mengikuti seminar: " + S1.countMahasiswa());

        ((Mahasiswa) M1).tampilDataMahasiswa();
        ((Mahasiswa) M2).tampilDataMahasiswa();
        ((Mahasiswa) M1).setDoswal((Dosen)D2);
        ((Mahasiswa) M1).tampilDataMahasiswa();
    }
}