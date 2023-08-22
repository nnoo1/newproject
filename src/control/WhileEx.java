package control;

//종료를 입력할 때까지 동물의 이름을 입력받는다. 입력받은 동물의 종류를 출력하라.
//while문 이용

import java.util.Scanner;

public class WhileEx {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    String bio = "", kind ="";

    while (true){
      System.out.println("동물이름을 입력하세요. 종료를 입력하면 끝납니다.");
      bio = in.next();
      if (bio.equals("종료")) break;
      switch (bio){
        case "호랑이", "사자"  -> kind="포유류";
        case "독수리", "참새"  -> kind ="조류";
        default -> kind ="해당없음";
      }
      System.out.printf("%s는 %s입니다\n",bio,kind );
    }


//나의 시도...
/*    int i = 0;
    while (true){
      System.out.println("동물의 이름을 입력하세요");
      Scanner in = new Scanner(System.in);
      String bio="";
      bio = in.nextLine();
      String a="사자";
      if(bio==a){
        System.out.println("포유류");
      } else if (bio=="독수리"){
        System.out.println("조류");
      } else if (bio=="종료"){
        break;
    }

    }*/

  }
}
