package classExample;

public class PhoneEx {
  public static void main(String[] args) {
    Phone myPhone = new Phone("갤럭시s23",1_000_000);
    System.out.println( Phone.getNumOfPhones()+"대가 생성됨");
    myPhone.print();
    System.out.println(myPhone.getNumOfPhones()+"대가 생성됨");

//    System.out.println("myPhone = " + myPhone); //myPhone = classExample.Phone@27d6c5e0 <<이 결과를 얻고싶지 않으면 toString 오버라이딩해줘야함

    Phone yourPhone = new Phone("아이폰",1_200_000);
    System.out.println( Phone.getNumOfPhones()+"대가 생성됨");
    yourPhone.print();
    System.out.println(myPhone.getNumOfPhones()+"대가 생성됨");

  }
}
