package challengeCh6;


public class OverrideTest {
  public static void main(String[] args) {
    Car c = new Car("파랑", 200, 1000, 5);
    c.show();

    //업캐스팅
    System.out.println();
    Vehicle v = c;
    v.show();

  }
}


