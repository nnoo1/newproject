package control;

import java.util.Scanner;

public class Switch3Ex {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.print("입력하세요 : ");
    String bio = in.nextLine();
    String kind = "";

    if(bio.equals("호랑이") || bio.equals("사자")) {
      kind = "포유류";
    } else if (bio.equals("독수리") || bio.equals("참새")){
      kind = "조류";
    }
    System.out.printf("%s는 %s입니다\n", bio, kind);


    //switch
    System.out.print("입력하세요 : ");
    bio = in.nextLine();
    kind = "";
   /* switch (bio){
      case "호랑이":
      case "사자":
        kind = "포유류";
        break;
      case "독수리":
      case "참새":
        kind = "조류";
        break;
      default:
        kind = "해당없음";
    }*/

    switch (bio) {
      case "호랑이", "사자"  -> System.out.println("포유류");
      case "독수리", "참새"  -> System.out.println("조류");
    }

    System.out.printf("%s는 %s입니다\n", bio, kind);
  }
}
