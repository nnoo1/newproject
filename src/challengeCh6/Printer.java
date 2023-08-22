package challengeCh6;
/* println() 메소드는 매개값을 콘솔에 출력합니다. println() 메소드의 매개값으로는
 int, boolean, doble, String타입 값을 줄 수 있습니다. 다음 조건과 예제 코드를 보고
  Printer 클래스에서 println() 메소드를 오버로딩하여 선언해보세요. */
public class Printer {
 static void println(int i) {
    System.out.println(i);
  }
  static void println(boolean b) {
    System.out.println(b);
  }
  static void println(double d) {
    System.out.println(d);
  }
  static void println(String s) {
    System.out.println(s);
  }

}
