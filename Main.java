import java.util.*;
public class Main {
  public static void main( String [] args){

    Scanner input = new Scanner(System.in);
    String [][] kindWords = new String[2][2];
    System.out.println("Please give me 4 kind words.");

    for(int i = 0; i<2;i++){
      for(int j = 0; j < 2; j++){
        System.out.print(".");
        kindWords[i][j]=input.next();
      }
    }

    System.out.println();

    for(int i = 0; i<2;i++){
      for(int j = 0; j < 2; j++){
        System.out.print(kindWords[i][j]);
      }
      System.out.println();
    }
  }
}
 