package chapter06;

public class Ball extends Circle {

  @Override
  protected void findRadius() {
    super.findRadius();
  }

  @Override
  public double findArea() {
    return 4 * Math.PI * radius * radius;
  }

  public double findVolume() {

    return 4 / 3 * (Math.PI * radius * radius * radius);
  }
}
