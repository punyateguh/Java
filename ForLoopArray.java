public class ForLoopArray{

    public static void main(String[]args){

        int arrayAngka[] = {11,12,13,14,15,16,17,18,19,20};

        // Looping standard
            System.out.println("ini adalah Looping standard ");
        for(int i = 0; i<10; i++){
            System.out.println("index ke " + i + " adalah " + arrayAngka[i]);
        }

        System.out.print("\n");

        // Looping dengan properti dari array
            System.out.println("ini adalah Looping dengan properti Array ");
        for(int i = 0; i<arrayAngka.length; i++){
            System.out.println("index ke "+ i + " adalah "+ arrayAngka[i]);
        }

        System.out.print("\n");

        // Looping dengan Foreach
            System.out.println("ini adalah Looping ForEach ");
        for(int angka : arrayAngka){
            System.out.println("Arraynya adalah "+angka);
        }



    }
}
