package challengeCh6;

class Circle {
  int radius;

  Circle(int radius) {
    this.radius = radius;
  }

  void show() {
    System.out.printf("반지름이 %d인 원이다.", radius);
  }
}

  class ColoredCircle extends Circle {
    String color;

    ColoredCircle(int radius, String color) {
      super(radius);
      this.color = color;
    }

    @Override
    void show() {
      System.out.printf("반지름이 %d인 %d원이다.",radius,color);

    }
  }





