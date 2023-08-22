package chapter05;

public class StringEx {
  public static void main(String[] args) {
    String s1 = "안녕,자바";
    String s2 = "안녕,자바";
    int i1 = 10;
    int i2 = 10;
    String s3 = new String("안녕자바");
    String s4 = new String("안녕자바");


    System.out.println(i1==i2);
    System.out.println(s1==s2);
    System.out.println(s1);
    System.out.println(s3 == s4);
    System.out.println(s3.equals(s4));

  }
}
