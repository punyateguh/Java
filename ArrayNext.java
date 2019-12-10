import java.util.Arrays;
public class ArrayNext{

    public static void main(String[]args){

        int arrayAngka1[] = {1,2,3,4,5};
        int arrayAngka2[] = new int[5];

        System.out.println(Arrays.toString(arrayAngka1));
        System.out.println(Arrays.toString(arrayAngka2));

       
        arrayAngka2 = arrayAngka1;

        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2);
        System.out.println(Arrays.toString(arrayAngka1));
        System.out.println(Arrays.toString(arrayAngka2));

        arrayAngka1[0] = 110;
        arrayAngka2[3] = 300;

        System.out.println(Arrays.toString(arrayAngka1));
        System.out.println(Arrays.toString(arrayAngka2));

        ubahArray(arrayAngka1);
        System.out.println(Arrays.toString(arrayAngka1));
        System.out.println(Arrays.toString(arrayAngka2));
    }

    // method argumennya adalah reference 
    // ini adalah past by reference bukan past by value
    
    private static void ubahArray(int[] dataArray){
        dataArray[0] = 125;
    }
}
