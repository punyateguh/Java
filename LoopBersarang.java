public class LoopBersarang{

    public static void main(String[]args){
    for (int i=0; i<5; i++){
        for(int j=0; j<5; j++){
            System.out.print("* ");
        }
        System.out.println("\n");
    }
    System.out.println("\n");
    for (int i=0; i<5; i++){
      for(int j=0; j<5; j++){
          System.out.print("* ");
          if(i==j){
            break;
          }
      }
      System.out.println("\n");
    }
    System.out.println("\n");
    for (int i=0; i<5; i++){
      for(int j=0; j<5; j++){
          System.out.print("* ");
          if(i + j == 4){
            break;
          }
      }
      System.out.println("\n");
    }
    for (int i=0; i<9; i++){
      for(int j=0; j<9; j++){
          System.out.print("* ");
          if(i==j){
            break;
          }else if(i+j==8){
            break;
          }
      }
      System.out.println("\n");
  }
}
}
