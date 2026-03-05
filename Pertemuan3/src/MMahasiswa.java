/* Nama File : MMahasiswa.java
 * Deskripsi : berisi main dari class Mahasiswa, Kendaraan, Dosen, MataKuliah
 * Pembuat : Akbar Mukti Wibowo 
 * Tanggal : 6 Maret 2026
 */

public class MMahasiswa {
    public static void main(String[] args) {
        /*============================DOSEN=========================== */
        System.out.println("=====DATA DOSEN=====");

        //tanpa parameter
        Dosen D1 = new Dosen();
        D1.setNama("Bp.Pbo");
        D1.setNip("789987");
        D1.setProdi("Rekayasa");

        // //dengan parameter
        // Dosen D1 = new Dosen("789987", "Bp.Pbo", "Rekayasa");

        System.out.println("Nama  : " + D1.getNama());
        System.out.println("NIP   : " + D1.getNip());
        System.out.println("Prodi : " + D1.getProdi());


        /*=====================MATA KULIAH======================== */
        System.out.println("\n=====MATA KULIAH=====");

        // //tanpa parameter
        // MataKuliah M1 = new MataKuliah();
        // M1.setId("RD999");
        // M1.setNama("rekayasaDunia");
        // M1.setSks(4);

        //dengan parameter
        MataKuliah M1 = new MataKuliah("RD999", "rekayasaDunia", 9);

        System.out.println("Nama Mata Kuliah : " + M1.getNama());
        System.out.println("ID Mata Kuliah   : " + M1.getId());
        System.out.println("Jumlah SKS       : " + M1.getSks());


        /*==========================KENDARAAN================== */
        System.out.println("\n=====KENDARAAN=====");

        //tanpa parameter
        Kendaraan K1 = new Kendaraan();
        K1.setNoPlat("RI1");
        K1.setJenis("Mobil");

        // //dengan parameter
        // Kendaraan K1 = new Kendaraan("RI1", "Mobil");

        System.out.println("No Plat         : " + K1.getNoPlat());
        System.out.println("Jenis Kendaraan : " + K1.getJenis());


        /*=====================MAHASISWA===================== */
        MataKuliah mk1 = new MataKuliah("R991", "Rekaysa Adegan", 3);
        MataKuliah mk2 = new MataKuliah("RH992", "Rekayasa Hukum", 4);

        System.out.println("\n=====DATA MAHASISWA=====");

        //tanpa parameter
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.setNim("MHS456");
        mhs1.setNama("Suka suka");
        mhs1.setProdi("Rekayasa");

        // //dengan parameter
        // Mahasiswa mhs1 = new Mahasiswa("MHS456", "Suka suka", "Rekayasa");

        mhs1.addMatKul(mk1);
        mhs1.addMatKul(mk2);
        mhs1.printMhs();

        System.out.println("\nJumlah Mata Kuliah : " + mhs1.getJumlahMatkul());
        System.out.println("Total SKS          : " + mhs1.getJumlahSks());

        //versi detail
        System.out.println("\n=====DETAIL MAHASISWA=====");

        mhs1.dosenWali = D1;
        mhs1.kendaraan = K1;

        mhs1.printDetailMhs();
    }
}
