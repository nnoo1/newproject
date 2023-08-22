package classExample;

public class Phone {
  private static long numOfPhones;
  String model;
  int value;

//  public Phone() {} //생성자
  public Phone(String model, int value){
    this.model = model;
    this.value = value;
    numOfPhones++;
  }

  public static long getNumOfPhones() {
    return numOfPhones;
  }

  void print(){
    System.out.println(value +"원 짜리 "+model+"의 스마트폰임");
  }
}
