package classExample2;



class Triangle {
  //생성자
  private double a =0.0;
  private double b = 0.0;

  //인자2개
  public Triangle(double a, double b) {
    this.a = a;
    this.b = b;
  }

  //게터세터

  public double getA() {
    return a;
  }

  public double getB() {
    return b;
  }

  public void setA(double a) {
    if(a<=0.0){
      System.out.println("삼각형의 높이는 0보다 커야함");
      return;
    }
    this.a = a;
  }

  public void setB(double b) {
    if(b<=0.0){
      System.out.println("삼각형의 밑변은 0보다 커야함");
      return;
    }
    this.b=b;
  }

  public double findArea() {
    return a * b/2;
  }

  public boolean isSameArea(Triangle t2){
   /* if(this.findArea() == t2.findArea()) return true;
    if(this.findArea() != t2.findArea()) return false;
    return false;*/
    return this.findArea() == t2.findArea();

  }


}
