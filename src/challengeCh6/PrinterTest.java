package challengeCh6;

public class PrinterTest {
  public static void main(String[] args) {
//    Printer printer = new Printer(); => 객체 생성하지 않고 하려면 Printer 클래스 void 앞에 static 넣어주고 아래 시작 소문자를 대문자로
    Printer.println(10);
    Printer.println(true);
    Printer.println(5.7);
    Printer.println("홍길동");

  }
}
