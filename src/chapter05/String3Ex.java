package chapter05;

public class String3Ex {
  public static void main(String[] args) {
    String s1 = "Hi, Java";
    String s2 = "!!!";
    String s3 = " ";
    String s4 = "";

    //J가져오기 : charAt
    System.out.println(s1.charAt(4));

    //concat
    System.out.println(s1.concat(s2));

    //isEmpty, isBlank
    System.out.println("s3.isEmpty() = "+s3.isEmpty());
    System.out.println("s4.isEmpty() = " +s4.isEmpty());
    System.out.println("s3.isBlank() = "+s3.isBlank());
    System.out.println("s4.isBlank() = "+s4.isBlank());

    //toLowerCase, toUpperCase
    System.out.println(s1.toLowerCase());
    System.out.println(s1.toUpperCase());
    System.out.println(s1); //아예 값이 바뀐게 아님을 알 수 있다

    //substring, length
    System.out.println(s1.substring(4));
    System.out.println(s1.substring(4, 6));
    System.out.println(s1.length());


  }
}
