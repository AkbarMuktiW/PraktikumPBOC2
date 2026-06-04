import java.util.*;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("16254", "Wowo");
        mahasiswaMap.put("74635", "Joko");
        mahasiswaMap.put("28473", "Mega");
        mahasiswaMap.put("19214", "Didin");

        //lambda digunakan sebagai parameter
        mahasiswaMap.forEach((nim, nama) -> System.out.println("Nim: " + nim + ", Nama: " + nama));
    }
}
