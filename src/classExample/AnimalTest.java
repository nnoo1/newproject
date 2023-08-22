package classExample;
//추상화
public class AnimalTest {
  public static void main(String[] args) {
    Object obj = new Object();

   /* int num = 10;
    Bird bird = null;
    System.out.println("bird = " + bird);

*/
    Bird bird = new Bird();
//    System.out.println("bird = " + bird);
    System.out.println(bird.toString());
    bird.움직인다();
//    bird.헤엄친다();
    bird.먹는다();

    Tiger tiger = new Tiger();
    tiger.움직인다();
//    tiger.달린다();
    tiger.숨쉰다();

    Animal animal = new Animal();
    animal.움직인다();

    Fish fish = new Fish();
    fish.움직인다();
  }
}
