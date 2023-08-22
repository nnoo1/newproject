package challengeCh4;

public class Circle {

    private static long numOfCircles;
    private static long numOfRedCircles;

    private double radius;

    private String color;

  public static long getNumOfCircles() {
    return numOfCircles;
  }

  public static long getNumOfRedCircles() {
    return numOfRedCircles;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Circle(double radius, String color) {
    this.radius = radius;
    this.color = color;
    numOfCircles++;
    if (color.equalsIgnoreCase("RED")){
      numOfRedCircles++;  //빨간공이 만들어질 때만 증가하도록 수정
    }




  }

}
