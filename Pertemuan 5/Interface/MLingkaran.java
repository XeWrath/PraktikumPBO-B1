package Interface;

import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jejari lingkaran: ");
        double jejari = scan.nextDouble();
        Lingkaran l = new Lingkaran(jejari);
        
    

        System.out.println("Luas Segitiga dengan jejari "+jejari+"\n Satuan adalah "+l.hitungLuas());
    }
}
