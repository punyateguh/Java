import java.util.Scanner;

public class LoopDeret{

    public static void main(String[]args){
        
        int fn, fn1, fn2, n;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("Mengambil Nilai Fibonaci ke - 1 ");
        n = inputUser.nextInt();

        fn1 = 0;
        fn2 = 1;
        
        for(int i=1; i<=n; i++){
            fn = fn1 + fn2;
            fn2 = fn1;
            fn1 = fn;
            System.out.println("Nilai ke -- "+ i + " adalah "+ fn);
        }
    }
}
