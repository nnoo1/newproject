package classExample;

public class LocalVarEx {
  public static void main(String[] args) {
    int a = 2;
    double b = 0.0;
    System.out.println("a = " + a);
    System.out.println("b = " + b);

    for (int i=0; i<2; i++){
      int c =1;
      System.out.println("c = " + c);
    }
//    System.out.println("c = " + c);
//    c는 for문 블럭 지역변수라서 에러남
    System.out.println("a = " + a);
  }
}
