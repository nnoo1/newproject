package chapter06;

public class Vehicle {
  String name = "탈 것";

  void whoAmI() {
    System.out.println("나는 탈 것 입니다");

  }

  static void move() {
    System.out.println("이동하다");

  }

  class Car extends Vehicle {

    String name = "자동차";

    @Override
    void whoAmI() {
      System.out.println("나는 자동차이다");

    }

    static void move() {
      System.out.println("달리다");
    }

    class SportsCar extends Car {
      void whoAmI() {
        System.out.println("니는 스포츠 자동차이다");

      }
    }



  }

}