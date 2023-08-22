package classExample;

public class CircleEx {
  public static void main(String[] args) {
    Circle circle = new Circle();
    circle.setRadius(1.0);
    System.out.printf("circle의 넓이 = %.2f", circle.findArea());
  }
}

//캡슐화
class Circle {
  private double radius = 0.0;  //외부에 공개하지 않을 private radius 값


  /*
  //게터
  public double getRadius() {
    return radius;
  }
  //세터
  public void setRadius(double r) {
    radius = r;

  }--------------------------------------------*/



  //alt + insert로 게터 세터 만들 수 있음
  //public은 생략가능(컨스트럭처>셀렉트논)
  public Circle() {
  }
  public Circle(double radius) {
    this.radius = radius;
  }
  public double getRadius() {
    return radius;
  }

  //원의 넓이를 구하는 findArea() 메서드 추가하기(Math.PI 사용)
  public double findArea(){
    return Math.PI * radius * radius;
  }



  public void setRadius(double radius) {
    if(radius<=0){
      System.out.println("원의 반지름은 0보다 커야합니다.");
    } else {
      this.radius = radius;
    }
    this.radius = radius;

  }
}