package chapter07;

public class AbstractMethodEx {
  public static void main(String[] args) {

  }

}

abstract class Database {
  double Pi = 3.14;

  abstract void use();

  abstract double getPi();
}

class Mysql extends Database {
  @Override
  void use() {
    System.out.println("Mysql을 사용합니다");
  }

  @Override
  double getPi() {
    return 0;
  }
}

class Oracle extends Database {

  @Override
  void use() {
    System.out.println("Oracle을 사용합니다.");
  }

  @Override
  double getPi() {
    return 1;
  }
}