public class Nestedif{
    public static void main(String[] args) {
        int a = 10;
        int b = 20; 

        if (a == 50){
            if (b == 5){
                System.out.println("a = 10 b = 20");
            }else{
                System.out.println("a = 10 b tidak = 20");
            }
        } else {
            System.out.println("a tidak = 10 b tidak = 20");
        }
    }
}
