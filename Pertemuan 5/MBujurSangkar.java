import java.util.Scanner;

class MBujurSangkar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.println("Masukkan sisi bujur sangkar: ");
        double sisi = scan.nextDouble();
        scan.close();
        System.out.println("Luas Bujur Sangkar dengan sisi"+sisi+
                    " Satuan adalah"+bs.hitungLuas(sisi));
    }
    
}
//jika kelas BujurSangkar tidak memberikan implementasi untuk metode abstrak yang dideklarasikan di kelas BangunDatar, maka akan terjadi kesalahan kompilasi karena Java membutuhkan implementasi untuk semua metode abstrak yang ada dalam kelas abstrak.