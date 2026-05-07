/* Nama file  : Piaraan.java
   Deskripsi  :berisi atribut dan method dari class Piaraan
   pembuat : Akbar Mukti Wibowo/24060124130063
   tanggal : 7 Mei 2026
 */

import java.util.LinkedList;

public class Piaraan {
    private int NbElm;
    private final LinkedList<Anabul> lAnabul;

    public Piaraan() {
        lAnabul = new LinkedList<>();
        NbElm = 0;
    }

    public int getNbElm() {
        return NbElm;
    }

    public void enqueueAnabul(Anabul anabul) {
        lAnabul.addLast(anabul);
        NbElm++;
    }

    public boolean isMember(Anabul anabul) {
        return lAnabul.contains(anabul);
    }

    public Anabul getAnabul() {
        return lAnabul.peekFirst();
    }

    public Anabul dequeueAnabul() {
        Anabul removed = lAnabul.pollFirst();
        NbElm--;
        return removed;
    }

    public int countKucing() {
        int count = 0;

        for(Anabul anabul : lAnabul) {
            if (anabul instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    public double bobotKucing() {
        double total = 0.0;
        for(Anabul anabul : lAnabul) {
            if (anabul instanceof Kucing) {
                total += ((Kucing)anabul).getBobot();
            }
        }
        return total;
    }

    public void showJenisAnabul() {
        for(Anabul anabul : lAnabul) {
            System.out.println((anabul.getNama()) + "- " + anabul.getClass().getName());
        }
    }
}
