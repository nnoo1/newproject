package chapter07;

public class EagleTest {
  public static void main(String[] args) {
    //기존방식
    /*    Eagle e = new Eagle();
    e.fly();*/

    ABird b = new ABird(){
      void fly(){
        System.out.println("독수리가 날아간다");
      }
    };
    b.fly();
  }

}

//기존방식
/*class Eagle extends ABird {
  @Override
  void fly() {
    System.out.println("독수리가 날아간다");
  }
}*/
