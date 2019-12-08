import java.util.Scanner;

public class LatihanMethod{

    public static void main(String[]args){
        Scanner inputpanjang = new Scanner(System.in);
        System.out.print("Masukan Panjang = ");
        int P = inputpanjang.nextInt();
        Scanner inputLebar = new Scanner(System.in);
        System.out.print("Masukan Lebar = ");
        int L = inputLebar.nextInt();

        gambar(P,L);
        tampilkan(P,L);
    }
// Method atau Fungsi Tampilkan Luas dan Keliling
    private static void tampilkan(int panjang,int lebar){
        System.out.println("luas = " + luas(panjang,lebar));
        System.out.println("Keliling = "+ Keliling(panjang,lebar));
    }

// Method atau Fungsi Gambar
    private static void gambar(int panjang, int lebar){
        for(int i = 0; i<panjang; i++){
            for(int j = 0; j<lebar; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    
 // Method atau Fungsi Luas   
    private static int luas(int panjang, int Lebar) {
        int hasil = panjang * Lebar;
        return hasil;
    }
    
// Method atau Fungsi Keliling
    private static int Keliling(int panjang, int Lebar){
        int hasil = (panjang + Lebar)*2;
        return hasil;
    }

}
