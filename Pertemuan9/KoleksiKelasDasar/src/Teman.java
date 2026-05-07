/* Nama file  : Teman.java
   Deskripsi  :berisi atribut dan method dari class Teman
   pembuat : Akbar Mukti Wibowo/24060124130063
   tanggal : 7 Mei 2026
 */

import java.util.ArrayList;

public class Teman {
    private int NbElm;
    private ArrayList<String> Lnama;

    public Teman() {
        Lnama = new ArrayList<>();
        NbElm = 0;
    }

    public int getNbElm() {
        return NbElm;
    }

    public String getNama(int indeks) {
        return Lnama.get(indeks);
    }

    public void setNama(int indeks, String nama) {
        Lnama.set(indeks, nama);
    }

    public void addNama(String nama) {
        Lnama.add(nama);
        NbElm++;
    }

    public void delNama(String nama) {
        if (Lnama.remove(nama)) {
            NbElm--;
        }
    }

    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    public void gantiNama(String nama, String namaBaru) {
        int idx = Lnama.indexOf(nama);
        if (idx != -1) {
            Lnama.set(idx, namaBaru);
        }
    }

    public int countNama(String nama) {
        int count = 0;

        for(String n : Lnama) {
            if(n.equals(nama)) {
                count++;
            }
        }

        return count;
    }
    
    public void showTeman() {
        for(String n : Lnama) {
            System.out.println("- " + n);
        } 
    }
}
