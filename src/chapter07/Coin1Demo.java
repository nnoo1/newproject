package chapter07;

public class Coin1Demo {
  public static void main(String[] args) {
    System.out.println("Dime은 " + Coin.DUME + "센트입니다");
  }
}

interface Coin {
  int PENNY = 1, NICKEL = 5, DUME = 10, QUARTER =25;

}