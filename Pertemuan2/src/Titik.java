/* Nama File : Titik.Java
 * Deskripsi : berisi attribut dan method dalam class Titik
 * Pembuat : Akbar Mukti Wibowo 
 * Tanggal : 26 Februari 2026
 */

public class Titik {
    /*******ATRIBUT********/
    double absis;
    double ordinat;
    double aplikat;
    static int counterTitik = 0; //static atribut dan method, tidak ada setter karena dia gk ganti ganti (tidak kita set)
    //static terikat ke class nya bukan objeknya, jd kta gk bisa kyk T1.countertitik bisanya Titik.getcountertitik (kalo t1.absis baru bisa) makanya kita butuh getter
    //konstruktor untuk membuat titik (0,0)
    //keyword this buat manggil dirisendiri, tp ini tidak akan berhasil apabila tidak ada kontruktor overloading
    Titik() {
        // absis = 0;
        // ordinat = 0;
        this(0,0);  //this;
    }
    
    // konstruktor versi ada input, disebut overloading karena memiliki nama fngsi yg sama tetapi ebrbeda di inputnya
    Titik(double x, double y) {
        absis = x;
        ordinat = y;
        counterTitik++;
    }

    static int getCounterTitik() {
        return counterTitik;
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

    //mencetak nilai counter titik
    // void printCounterTitik() {
    //     System.out.println(this.counterTitik);
    // }

    //mencetak kuadran
    int getKuadran() {
        if (this.absis > 0 && this.ordinat > 0) {
            return 1;
        }
        else if (this.absis > 0 && this.ordinat < 0) {
            return 2;
        }
        else if (this.absis < 0 && this.ordinat < 0) {
            return 3;
        }
        else if (this.absis > 0 && this.ordinat < 0) {
            return 4;
        }
        else {
            return 0;
        }
    }

    void refleksiX() {
        ordinat = ordinat * -1;
    }

    void refleksiY() {
        absis = absis * -1;
    }

    double getJarakPusat() {
        return Math.sqrt((absis*absis + ordinat*ordinat));
    }

    double getJarak(Titik T2) {
        return Math.sqrt(
        (absis - T2.absis)*(absis - T2.absis) +
        (ordinat - T2.ordinat)*(ordinat - T2.ordinat)
        );
    }

    Titik getRefleksiX() {
        return new Titik(getAbsis(),-getOrdinat());
    }

    Titik getRefleksiY() {
        return new Titik(-getAbsis(),getOrdinat());
    }
}
 //end class titik