import java.util.HashMap;
import java.util.Map;

public class MapLambda {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060122140190", "Boyek");
        mahasiswaMap.put("24060122140189", "Muni");
        mahasiswaMap.put("24060122140900", "Kali");
        mahasiswaMap.put("24060122140271", "Tira");

        // Menggunakan ekspresi lambda untuk menampilkan key dan value
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}