/* Nama file  : MainTeman.java
   Deskripsi  :berisi penggunaan atribut dan method dari class Teman
   pembuat : Akbar Mukti Wibowo/24060124130063
   tanggal : 7 Mei 2026
 */

public class MainTeman {
    public static void main(String[] args) {
        Teman teman = new Teman();

        //tambah nama
        teman.addNama("Akbar");
        teman.addNama("Budi");
        teman.addNama("Citra");
        teman.addNama("Budi");

        //tampilkan semua teman
        System.out.println("Daftar Teman:");
        teman.showTeman();

        //tampilkan jumlah elemen
        System.out.println("\nJumlah teman: " + teman.getNbElm());

        //cek member
        System.out.println("\nApakah Budi ada?");
        System.out.println(teman.isMember("Budi"));

        teman.gantiNama("Citra", "Doni");

        System.out.println("\nSetelah ganti nama:");
        teman.showTeman();

        //hapus nama
        teman.delNama("Budi");

        System.out.println("\nSetelah hapus Budi:");
        teman.showTeman();

        //count nama
        System.out.println("Nama Budi muncul sebanyak: " + teman.countNama("Budi"));
    }
}