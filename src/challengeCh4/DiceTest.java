package challengeCh4;

public class DiceTest {
  public static void main(String[] args) {
    Dice d = new Dice();
    for (int i=0; i<6; i++) {
      System.out.printf("주사위의 숫자 : %d\n",d.roll());
    }

  }
}
