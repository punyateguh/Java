public class Method{

    public static void main(String[]args){

        int x,y;
        x= 5;
        y= hitung(x);

        System.out.println("x = " + x + ", y = " + y);
    }
    
    static int hitung(int input){
        int hasil ;

        hasil = (input+2)* input;
        return hasil;
    

    }
}
