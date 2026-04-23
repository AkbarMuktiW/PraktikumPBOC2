/* Nama File : InclusionMain.java
 * Deskripsi : Berisi main penerapan polymorfism Inclusion
               (Parent class punya banyak child class)
 * Pembuat : Akbar Mukti Wibowo/24060124130063
 * Tanggal : 23 April 2026
 */

import java.util.ArrayList;

public class InclusionMain {
    public static void main(String[] args) {
        Anabul anabul1 = new Kucing("Bobby");
        Anabul anabul2 = new Anjing("Bybob");
        Anabul anabul3 = new Burung("Cuit");

        ArrayList<Anabul> anabuls = new ArrayList<>();
        anabuls.add(anabul1);
        anabuls.add(anabul2);
        anabuls.add(anabul3);

        for (Anabul anabul : anabuls) {
            anabul.bersuara();
            anabul.gerak();
            System.out.println();
        }
    }
}
