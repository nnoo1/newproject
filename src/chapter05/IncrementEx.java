package chapter05;

public class IncrementEx {
  public static void main(String[] args) {
    for (String arg:args){

    }

    int[] x = {0,1,2};
    System.out.println("increment 호출 전 x[0] = " + x[0]);
    increment(x); //주소값 복사
    System.out.println("increment 호출 후 x[0] = " + x[0]);
  }

  private static void increment(int[] n) {
    System.out.println("increment 메서드, 값 변경 전 n[0] = " + n[0]);
    n[0]++;
    System.out.println("increment 메서드, 값 변경 후 n[0] = " + n[0]);
  }
}
