package challengeCh4;

public class CircleTest {
  public static void main(String[] args) {
    Circle c1 = new Circle(5.0,"yellow");
    Circle c2 = new Circle(1.0,"rEd");
    Circle c3 = new Circle(3.0,"RED");

    System.out.println(Circle.getNumOfCircles());
    System.out.println(Circle.getNumOfRedCircles());
  }
}
