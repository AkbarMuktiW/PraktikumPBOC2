/* Nama file  : Main.java
   Deskripsi  :berisi penerapan dari semua class
   pembuat : Akbar Mukti Wibowo/24060124130063
   tanggal : 30 April 2026
 */

public class Main {
    private static void tampilkanAnabul(Anabul anabul) {
        anabul.Gerak();
        anabul.Bersuara();

        if(anabul instanceof Kucing) {
            ((Kucing) anabul).printBobot();
        }
    }

    
    public static void main(String[] args) {
        // KELAS GENERIK
        Datum<Anabul> data = new Datum<Anabul>(new Kucing("Mimi", 3.5));
        
        tampilkanAnabul(data.getIsi());
        System.out.println();

        data.setIsi(new Anggora("Chiki", 4.2));
        tampilkanAnabul(data.getIsi());
        System.out.println();

        data.setIsi(new KembangTelon("Wowo", 5.1));
        tampilkanAnabul(data.getIsi());

        // METHOD GENERIK
        System.out.println("Prosedur Tukar");

        Datum<Anabul> hewan1 = new Datum<>(new Kucing("Willy", 4.5));
        Datum<Anabul> hewan2 = new Datum<>(new Anjing("Bobby"));

        OperatorGenerik.Tukar(hewan1, hewan2);

        tampilkanAnabul(hewan1.getIsi());
        tampilkanAnabul(hewan2.getIsi());

        // GENERIK INTEGER
        Datum<Integer> angka1 = new Datum<>(9);
        Datum<Integer> angka2 = new Datum<>(5);

        OperatorGenerik.Tukar(angka1, angka2);

        System.out.println(angka1.getIsi()); // 5
        System.out.println(angka2.getIsi()); // 9

        // 3. KELAS DATA
        // a.
        System.out.println("Aplikasi Kelas Data");

        Data<String> dataNama = new Data<>(new String[0]);
        dataNama.setIsi(1, "Andi");
        dataNama.setIsi(2, "Budi");
        dataNama.setIsi(10, "Citra");

        System.out.println("Isi posisi 1: " + dataNama.getIsi(1));
        System.out.println("Isi posisi 2: " + dataNama.getIsi(2));
        System.out.println("Isi posisi 10: " + dataNama.getIsi(10));
        System.out.println("Banyak elemen efektif: " + dataNama.getSize());
        System.out.println("Isi posisi 6: " + dataNama.getIsi(6)); // null

        // B. setIsi Anabul
        System.out.println("\nAplikasi Data Anabul (setIsi)");

        Data<Anabul> dataHewan = new Data<>(new Anabul[0]);

        dataHewan.setIsi(1, new Kucing("Mimi", 3.5));
        dataHewan.setIsi(2, new Anjing("Doggy"));
        dataHewan.setIsi(3, new Anggora("Kiki", 4.2));
        dataHewan.setIsi(4, new KembangTelon("Momo", 5.1));

        // C. getIsi Anabul
        System.out.println("\nMenampilkan isi Data Anabul:");

        tampilkanAnabul(dataHewan.getIsi(1));
        System.out.println();

        tampilkanAnabul(dataHewan.getIsi(2));
        System.out.println();

        tampilkanAnabul(dataHewan.getIsi(3));
        System.out.println();

        tampilkanAnabul(dataHewan.getIsi(4));
        System.out.println();

        // D. getSize Anabul
        System.out.println("Jumlah elemen efektif: " + dataHewan.getSize());
    }
}
