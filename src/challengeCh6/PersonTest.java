package challengeCh6;

public class PersonTest {
  public static void main(String[] args) {
    Person[] p = {new Person("길동이",22),
            new Student("황진이",23,100),
            new ForeignStudent("Amy",30,200,"U.S.A")};

    for (Person k : p) {
      System.out.println(k.show());
    }
  }
}