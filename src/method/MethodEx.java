package method;

public class MethodEx {
  public static void main(String[] args) {
  /*  int sum = 0;
    for (int i = 0; i <= 10; i++) {
      sum += i;
    }
    System.out.println("sum1~10 = " + sum);
    sum = 0;
    for (int i = 10; i <= 100; i++) {
      sum += i;
    }
    System.out.println("sum10~100 = " + sum);
  }
*/

    /*
      sum(1,10);
      sum(10,100);
      sum(100,1000);
    }

  static int sum(int num1, int num2) {
    int sum = 0;
    for (int i=num1; i<=num2; i++) {
      sum += i;
    }
    return sum;

*/
        System.out.println("합(1~10) : " + sum(1, 10));
        System.out.println("합(10~100) : " + sum(10, 100));
        System.out.println("합(100~1000) : " + sum(100, 1000));
      }
      public static int sum(int i1, int i2) {
        int sum = 0;
        for (int i = i1; i <= i2; i++)
          sum += i;
        return sum;
      }
    }

