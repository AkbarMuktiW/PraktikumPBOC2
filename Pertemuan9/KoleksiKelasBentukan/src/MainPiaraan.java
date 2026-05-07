/* Nama file  : MainPiaraan.java
   Deskripsi  :berisi penggunaan dari class Piaraan
   pembuat : Akbar Mukti Wibowo/24060124130063
   tanggal : 7 Mei 2026
 */

public class MainPiaraan {
    public static void main(String[] args) {
        Piaraan piaraan = new Piaraan();
        Anabul A1 = new Kucing("Catty", 7);

        //menambahkan anabul
        piaraan.enqueueAnabul(new Anjing("anjing ini"));
        piaraan.enqueueAnabul(new Kucing("Kucing ini", 7.8));
        piaraan.enqueueAnabul(new Anggora("Anggora ini", 8));
        piaraan.enqueueAnabul(new KembangTelon("Kembang ini", 7));

        //tampilan setelah enqueue
        System.out.println("================================");
        System.out.println("Ada sebanyak : " + piaraan.getNbElm() + " piaraan");
        System.out.println("===== Tampilan Enqueue =====");
        piaraan.showJenisAnabul();

        //cek ismember
        System.out.println("================================");
        System.out.println("Apakah Catty member? " + piaraan.isMember(A1));

        //cek anabul indeks pertama
        System.out.println("================================");
        System.out.println("Get Anabul = " + piaraan.getAnabul());

        //menghapus anabul
        System.out.println("================================");
        piaraan.dequeueAnabul();
        piaraan.dequeueAnabul();
        System.out.println("\n===== Tampilan Dequeue =====");
        piaraan.showJenisAnabul();

        //countKucing
        System.out.println("================================");
        System.out.println("Ada sebanyak " + piaraan.countKucing() + " kucing");

        //bobotKucing
        System.out.println("================================");
        System.out.println("Total bobot kucing : " + piaraan.bobotKucing() + "kg");
    }
}
