package chapter07;


class AnonymousDemo {
  public static void main(String[] args) {
//    Parent p = new OnlyOnce();
//    p.parent();

    //익명클래스 : 클래스의 선언과 객체의 생성을 동시에 하는 이름 없는 클래스(일회용)
    Parent p = new Parent() {
      @Override
      public void parent() {
        System.out.println("익명클래스에서 구현한 메서드");
      }
    };

    //위에는 인터페이스 이거는 클래스
  /*  Parent2 p2 = new Parent2(){
      public void parent2() {
        System.out.println("클래스,....");
      }
    }*/;

    p.parent();
//    p2.parent2();

  }

}

//클래스 만들던 기존에 하던 방식
/*class OnlyOnce implements Parent {

  @Override
  public void parent() {
    System.out.println("parent");
  }
}*/

interface Parent {
  void parent();
}

/*
class Parent2 {
  void parent2() {

  }
}
*/
