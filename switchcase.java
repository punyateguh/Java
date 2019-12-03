import java.util.Scanner;

public class switchcase{

    public static void main(String[] args){
    
    Scanner user = new Scanner(System.in);
    System.out.println("Apa ?");
    String input = user.next();
    
    

    switch(input){
        case "halo":
            System.out.println("Hallo juga");
            break;
        case "apa kabar":
            System.out.println("Kabar Baik !!");
            break;
        default:
        System.out.println("Maaf saya tidak mengerti ucapanmu");
    }

    }
}
