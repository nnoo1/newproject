package chapter07;

public class MovableDemo {
  public static void main(String[] args) {
    Movable m = new Car();
    m.move(10);

    Car car = new Car();
    car.move(10);


  }
}

interface Movable {
  void move(int distance);
}

class Car implements Movable {
  @Override
  public void move(int distance) {
    System.out.println("자동차가 " + distance +"m 이동했다");
  }


}
