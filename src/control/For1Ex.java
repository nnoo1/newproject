package control;

public class For1Ex {
  public static void main(String[] args) {

    //for문-------------------------------------------
    /*for (int i = 0; i < 10; i++){
      System.out.println(i+1 + " hello world");
    }
*/

    //while문-------------------------------------------
    /*int i = 0;
    while (i < 10){
      System.out.println(i+1 + " hello world");
      i++;
    }*/

    //-------------------------------------------
    int i = 0;
    while (true){
      System.out.println(i+1 + " hello world");
      i++;
      if(i == 10){
        break;
      }
    }

  }
}
