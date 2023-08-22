package chapter07;

public class InnerInterfaceDemo implements Icon.Tochable {

  @Override
  public void touch() {
    System.out.println("아이콘을 터치한다");

  }

  public static void main(String[] args) {
    Icon.Tochable it = new InnerInterfaceDemo();
    it.touch();

  }


}

class Icon {
  interface Tochable {
    void touch();
  }
}
