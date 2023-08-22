package chapter05;

import classExample2.Circle;

public class ArrayClass1Ex {
  public static void main(String[] args) {
    //findArea가 있는 circle을 원소로 가지는 배열, 배열의 크기는 5
    //circle의 radius 각각 다르게 초기화(1.0, 2.0, 3.0, 4.0, 5.0)
    //5개의 원의 넓이를 출력

    Circle[] circles = new Circle[5];
    for (int i = 0; i < circles.length; i++) {
      circles[i] = new Circle((double) i + 1);
      for (Circle circle : circles) {
        System.out.printf("원의(%d) 넓이 = %.2f ", i, circle.findArea());
      }
    }
  }
}