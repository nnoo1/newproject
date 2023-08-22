package classExample2;

public class StaticInitTest {
  public static void main(String[] args) {
    System.out.println(StaticInit.sumOneToTen);
    StaticInit staticInit = new StaticInit();
    System.out.println(staticInit.sumOneToTen2);
  }
}

class StaticInit{
  static int sumOneToTen;
  static{
      int sum = 0;
      for (int i = 1; i<=10; i++){
        sum += 1;
      }
    sumOneToTen = sum;
  };
  int sumOneToTen2;
  {
    int sum = 0;
    for (int i = 1; i<=10; i++){
      sum += 1;
    }
    sumOneToTen2 = sum;
  }
}