import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList =new ArrayList<>();
        mahasiswaList.add("Boyek");
        mahasiswaList.add("Muni");
        mahasiswaList.add("Kali");
        mahasiswaList.add("Tira ");


        mahasiswaList.forEach((nama) -> System.out.println(nama));
        
    }
}
