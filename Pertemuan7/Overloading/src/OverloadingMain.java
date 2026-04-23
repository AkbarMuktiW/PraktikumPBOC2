/* Nama File : OverloadingMain.java
 * Deskripsi : Berisi main dari penerapan polymorfism Overloading
               (Nama prosedur/fungsi sama tetapi parameter berbeda)
 * Pembuat : Akbar Mukti Wibowo/24060124130063
 * Tanggal : 23 April 2026
 */

public class OverloadingMain {
    public static void main(String[] args) {
        //konstruktor default
        System.out.println("===== KONSTRUKTOR DEFAULT =====");
        Mahasiswa m1 = new Mahasiswa();
        System.out.println("Objek default: ");
        m1.tampil();

        //konstruktor dengan parameter
        System.out.println("\n===== KONSTRUKTOR PARAMETER =====");
        Mahasiswa m2 = new Mahasiswa("123", "Prabroro", "Informatika");
        System.out.println("Objek dengan parameter: ");
        m2.tampil();

        //konstruktor clonning
        System.out.println("\n===== KONSTRUKTOR CLONNING =====");
        Mahasiswa m3 = new Mahasiswa(m2);
        System.out.println("Objek hasil cloning: ");
        m3.tampil();

        //overloading method
        System.out.println("\n======= OVERLOADING =======");
        //tanpa parameter
        System.out.println("===== TANPA PARAMETER =====");
        m1.setProgramStudi();
        System.out.println("Set tanpa param: ");
        m1.tampil();

        //dengan string
        System.out.println("\n===== PARAMETER STRING =====");
        m1.setProgramStudi("Informatika");
        System.out.println("Set dengan String: ");
        m1.tampil();

        //dengan objek mhs
        System.out.println("\n===== PARAMETER OBJEK =====");
        m1.setProgramStudi(m2);
        System.out.println("Set dari objek lain (m2): ");
        m1.tampil();
    }
}
