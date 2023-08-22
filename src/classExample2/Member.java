package classExample2;

//필드 : 이름, 아이디, 암호, 나이(0~100살)
//생성자(모든 회원정보 사용)
//접근자
//설정자(이름, 나이(120)
public class Member {
  public Member(String name, String id, String pass, int age) {
    this.name = name;
    this.id = id;
    this.password = password;
    this.age = age;
  }

  private String name;
  private String id;
  private String password;
  private int age;

  public String getName() {
    return name;
  }

  public String getId() {
    return id;
  }

  public String getPassword() {
    return password;
  }

  public int getAge() {
    return age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    if (0<age && age<120){
      this.age = age;
    } else {
      System.out.println("올바른 나이를 입력해주세요");
    }
  }
}

