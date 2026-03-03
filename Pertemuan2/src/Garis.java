/* Nama File : Garis.Java
 * Deskripsi : berisi attribut dan method dalam class Garis
 * Pembuat : Akbar Mukti Wibowo 
 * Tanggal : 3 Maret 2026
 */

public class Garis {
    Titik awal;
    Titik akhir;
    static int counterGaris = 0;

    Garis() {
        this.awal = new Titik(0, 0);
        this.akhir = new Titik(1, 1);
        counterGaris++;
    }
    Garis(Titik P, Titik Q) {
        this.awal = P;
        this.akhir = Q;
        counterGaris++;
    }

    // Getter
    Titik getAwal() {
        return awal;
    }
    Titik getAkhir() {
        return akhir;
    }
    static int getCounterGaris() {
        return counterGaris;
    }

    // Setter
    void setAwal(Titik P) {
        this.awal = P;
    }
    void setAkhir(Titik Q) {
        this.akhir = Q;
    }
    // Panjang garis
    double getPanjang() {
        return awal.getJarak(akhir);
    }

    double getGradien() {
        double x1 = awal.getAbsis();
        double y1 = awal.getOrdinat();
        double x2 = akhir.getAbsis();
        double y2 = akhir.getOrdinat();

        if (x2 - x1 == 0) {
            throw new ArithmeticException("Gradien tak terdefinisi (garis vertikal)");
        }
        return (y2 - y1) / (x2 - x1);
    }

    Titik getTitikTengah() {
        double xTengah = (awal.getAbsis() + akhir.getAbsis()) / 2;
        double yTengah = (awal.getOrdinat() + akhir.getOrdinat()) / 2;
        return new Titik(xTengah, yTengah);
    }

    boolean isSejajar(Garis G2) {
        return this.getGradien() == G2.getGradien();
    }

    boolean isTegakLurus(Garis G2) {
        return this.getGradien() * G2.getGradien() == -1;
    }

    void printGaris() {
        System.out.print("Garis dari ");
        awal.printTitik();
        System.out.print(" ke ");
        akhir.printTitik();
    }

    String getPersamaan() {
        double m = getGradien();
        double c = awal.getOrdinat() - m * awal.getAbsis();
        return "y = " + m + "x + " + c;
    }
}
