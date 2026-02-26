/* Nama File : MTitik.Java
 * Deskripsi : berisi main titik
 * Pembuat : Akbar Mukti Wibowo 
 * Tanggal : 26 Februari 2026
 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); //membuat objek titik T1 (0,0)
        Titik T2 = new Titik();
        T1.setAbsis (3); //mengubah absis T1 dengan nilai 3
        T1.setOrdinat (4); //mengubah ordinat T1 dengan nilai 4
        System.out.print("Titik T1 : ");
        T1.printTitik () ; //mencetak koordinat T1 ke layar
        T1.geser (3,4); //menggeser Tl sejauh (3,4)
        System.out.print("\nTitik T1 setelah digeser : ");
        T1.printTitik() ; //menampilkan koordinat T1 setelah digeser
        
        T2 = T1;
        System.out.print("\nTitik T2 : ");
        T2.printTitik();

        //cek overloading
        Titik T3 = new Titik(2, 3);
        System.out.print("\nTitik T3 : ");
        T3.printTitik();

        //cek static
        System.out.println("\nJumlah objek titik : " + Titik.getCounterTitik());

        T1.refleksiX();
        System.out.print("\nSetelah refleksi sumbu X : ");
        T1.printTitik();

        T1.refleksiY();
        System.out.println("Setelah refleksi sumbu Y : ");
        T1.printTitik();

        System.out.println(("\nTitik T1 ada di kudran : "));
        T1.getKuadran();

    }
}