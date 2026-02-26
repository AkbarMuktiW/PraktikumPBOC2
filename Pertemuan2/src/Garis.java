public class Garis {
    Titik awal;
    Titik akhir;
    static int counterGaris;

    public Garis(Titik P, Titik Q) {
        awal = P;
        akhir = Q;
        counterGaris++;
    }

    public Garis() {
        //pake this
    }

    void setGarisAwal(Titik P) {
        awal = P;
    }

    void setGarisAkhir(Titik Q) {
        awal = Q;
    }
    
}
