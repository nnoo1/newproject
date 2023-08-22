package classExample2;

public class Person {

  private String name;
  private int age;

  public String getName() {
    return name;
  }

  //void 대신 클래스로 하고 리턴타입을 자기자신....
  public Person setName(String name) {
    this.name = name;
    return this;
  }

  public int getAge() {
    return age;
  }

  public Person setAge(int age) {
    this.age = age;
    return this;
  }

  public void sayHello(){
    System.out.println(age+"살 "+name+"입니다.");
  }
}
