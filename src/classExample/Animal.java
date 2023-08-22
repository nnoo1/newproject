package classExample;

//상속

//부모클래스
class Animal {
  private String name = "Animal";
  void 숨쉰다(){
    System.out.println("숨쉰다");
  }
  void 먹는다(){
    System.out.println("먹는다");
  }
  void 움직인다(){
    System.out.println("움직인다");
  }

  @Override
  public String toString() {
    return "제 이름은 "+name+" 입니다";
  }
}

//자식
class Bird extends Animal {
  private String name = "Bird";
  @Override //alt+insert  or  ctrl+o
  void 움직인다() {
    super.움직인다();
    System.out.println("날아간다");
  }
  public String toString() {
    return "제 이름은 "+name+"입니다";
  }
  /*void 헤엄친다(){
    System.out.println("헤엄친다");

  }*/
}

class Tiger extends Animal {
  private String name = "Tiger";
  @Override
  void 움직인다() {
    super.움직인다();
    System.out.println("달린다");
  }
  public String toString() {
    return "제 이름은 "+name+"입니다";
  }

  /*void 달린다(){
    System.out.println("달린다");
*/
  }

  class Fish extends Animal{
    private String name = "Fish";
    @Override
    void 움직인다() {
      super.움직인다();
      System.out.println("ㅎㅔ엄친다");
    }
    public String toString() {
      return "제 이름은 "+name+"입니다";
    }
  }