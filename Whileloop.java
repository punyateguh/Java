public class Whileloop{

    public static void main(String[]args){

        int a = 0;
        String b = "_*";
        boolean kondisi = true;

        while(kondisi){

            System.out.println(a);
            System.out.println(b);
            a++;
            b+= "_*";

            if (a == 8){
                kondisi = false;
            }
        }
    }
}
