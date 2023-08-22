package classExample2;

public class Circle {
  double radius;
  String color;
//-----------------------------------------------------------추가
  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getColor() {
    return color;
  }
  public double findArea(){
    return Math.PI * radius * radius;
  }

  //---------------------------------------------------------------
  public Circle(){
    this(1.0, "White");
/*    this.radius = 1.0;
    this.color ="White";*/
  }

  public Circle(double radius){
    this.radius = radius;
    this.color ="White";
  }

  public Circle(String color){
    /* this.radius = 1.0;
    this.color = color;*/
  }

  public Circle(double radius, String color){
    this.radius = radius;
    this.color =color;
  }



}
