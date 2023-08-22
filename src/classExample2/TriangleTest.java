package classExample2;

/*public class TriangleTest {
  public static void main(String[] args) {
    Triangle t = new Triangle(10.0,5.0);
    System.out.println("삼각형의 넓이는 : "+t.findArea());
  }

}*/

public class TriangleTest {
  public static void main(String[] args) {
    Triangle t1 = new Triangle(10.0,5.0);
    Triangle t2 = new Triangle(5.0,10.0);
    Triangle t3 = new Triangle(8.0,8.0);
    System.out.println(t1.isSameArea(t2));
    System.out.println(t1.isSameArea(t3));
  }

}