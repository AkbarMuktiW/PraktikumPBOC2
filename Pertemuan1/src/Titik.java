/* Nama File : Titik.Java
 * Deskripsi : berisi attribut dan method dalam class Titik
 * Pembuat : Akbar Mukti Wibowo 
 * Tanggal : 19 Februari 2026
 */

public class Titik {
    /*******ATRIBUT********/
    double absis;
    double ordinat;
    //konstruktor untuk membuat titik (0,0)
    Titik() {
        absis = 0;
        ordinat = 0;
    }

    //mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru x
    void setOrdinat(double y) {
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat tiitk masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
} //end class titik