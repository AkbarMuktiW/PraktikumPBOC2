public class MGaris {
    public static void main(String[] args) {
        Titik A = new Titik(-2, 0);
        Titik B = new Titik(0, 4);
        Garis G1 = new Garis(A, B);
        G1.printGaris();

        System.out.println("Panjang garis : " + G1.getPanjang());
        System.out.println("Gradien : " + G1.getGradien());

        Titik tengah = G1.getTitikTengah();
        System.out.print("Titik Tengah : ");
        tengah.printTitik();

        System.out.println("Persamaan garis : " + G1.getPersamaan());

        //garis kedua
        Garis G2 = new Garis(new Titik(1, 1), new Titik(3, 5));

        System.out.println("Sejajar? " + G1.isSejajar(G2));
        System.out.println("Tegak Lurus? " + G1.isTegakLurus(G2));

        System.out.println("\nJumlah objek garis : " + Garis.getCounterGaris());
    }
}