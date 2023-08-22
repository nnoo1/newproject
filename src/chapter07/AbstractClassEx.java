package chapter07;

public class AbstractClassEx {
  public static void main(String[] args) {
    Circle c = new Circle();
    c.draw();

    Squres s = new Squres();
    s.draw();

  }
}


abstract class Shape {
  double pi = 3.14;

  abstract void draw();

  public double findArea(){
    return 0.0;
  }
}

class Circle extends Shape {

  @Override
  void draw() {
    System.out.println("원을 그리다");
  }
}

class Squres extends Shape {

  @Override
  void draw() {
    System.out.println("사각형을 그리다");

  }
}
