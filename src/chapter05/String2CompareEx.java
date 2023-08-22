package chapter05;

import classExample.Car;

public class String2CompareEx {
  public static void main(String[] args) {
    String s1 = "HI, JAVA";
    String s2 = "HI, java";

    Car c1 = new Car();
    Car c2 = new Car();
    System.out.println(c1 == c2); //==와 != 연산자는 두 문자열의 내용을 비교하는 것이 아니라 동일한 객체인지 검사
    System.out.println(c1.equals(c2));  //compareTo는 못 씀

    System.out.println("---------------------------------");

    System.out.println(s1.equals(s2));
    System.out.println(s1.equalsIgnoreCase(s2));
    System.out.println(s1.compareTo(s2));
    System.out.println(s1.compareToIgnoreCase(s2));

  }
}
