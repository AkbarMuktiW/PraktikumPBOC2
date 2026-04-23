/* Nama File : CoercionMain.java
 * Deskripsi : Penerapan polymorfisme Coercion (casting)
 * Pembuat : Akbar Mukti Wibowo/24060124130063
 * Tanggal : 23 April 2026
 */

public class CoercionMain {
    public static void main(String[] args) {
        int nilai = 65;

        //int -> 'a'
        System.out.println("===== int->'a' =====");
        int output = 'a';
        System.out.println(output);

        //int -> char
        System.out.println("\n===== int->char =====");
        char charVal = (char) nilai;
        System.out.println("Integer to Char: " + charVal);

        //int -> double
        System.out.println("\n===== int->double =====");
        double doubleVal = nilai;
        System.out.println("Integer to Double: " + doubleVal);

        //double -> int
        System.out.println("\n===== double->int =====");
        double real = 65.9;
        int ubahInt = (int) real;
        System.out.println("Double to Int: " + ubahInt);

        //konkatenasi int
        System.out.println("\n===== KONKATENASI INT =====");
        String X = "1234";
        String Y = "5678";

        String S = X + Y;
        System.out.println("Konkatenasi (int) String: " + S);

        //penjumlahan (parseInt)
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("Penggunaan parseInt: " + Z);

        //konkatenasi double
        System.out.println("\n===== KONKATENASI DOUBLE =====");
        String P = "12.34";
        String Q = "56.78";

        String R = P + Q;
        System.out.println("Konkatenasi (double) String: " + R);

        //penjumlahan (parseDouble)
        double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("Penggunaan parseDouble: " + D);

        //Konversi S -> Integer A
        System.out.println("\n===== KONVERSI=====");
        int A = Integer.parseInt(S);
        System.out.println("Integer A dari S: " + A);

        //Konversi A -> String T
        String T = Integer.toString(A);
        System.out.println("String T dari A: " + T);
    }
}
