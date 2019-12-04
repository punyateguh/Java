import java.util.Scanner;
public class Logic{

    public static void main(String[] args){
    
        Scanner z = new Scanner(System.in);

        System.out.print("Nilai Uts = ");
        int uts = z.nextInt();
        System.out.print("Nilai Uas = ");
        int uas = z.nextInt();

        int total = uts + uas ;

        if (total < 70) {
            System.out.println(total + " Remedial");
        } else if( total == 70 ){
            System.out.println(total + " Pas KKM");
        } else{
            System.out.println(total + " Lulus ");
        }

    }
 
}
