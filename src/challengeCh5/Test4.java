package challengeCh5;

import java.util.Scanner;

public class Test4 {
  //다음과 같이 키보드에서 URL을 입력받은 후 'com'으로 끝나는지, 'java'를 포함하는지
  // 조사하는 프로그램을 작성하시오. 'bye'를 입력하면 프로그램은 종료된다.
  public static void main(String[] args) {
    String a, b, c, d;
    Scanner input = new Scanner(System.in);

    while(true) {
      System.out.print("URL을 입력하세요 : ");
      a = input.nextLine();
      b = "com";
      c = "java";
      d = "bye";
      if(a.endsWith(b)) {
        System.out.println(a + "은 '" + b + " '으로 끝납니다.");
      }
      if(a.endsWith(c)) {
        System.out.println(a + "은 '" + c + " '으로 끝납니다.");
      } else if (a.contains(d)) {
        break;
      }
    }
  }


}
