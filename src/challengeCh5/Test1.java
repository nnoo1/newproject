package challengeCh5;

public class Test1 {
//문자열과 문자를 매개변수 값으로 가지는 다음 메서드가 있다. 문자열 s에 포함된 문자 c의 개수를
// 반환하도록 이 메서드를 구현하시오. //static int countChar(String s, char c);

public static int countChar (String s, char c) {
  int count = 0;

  for (int i = 0; i < s.length(); i++) {
    if (Character.toUpperCase(c) == s.toUpperCase().charAt(i)) {
      count++;
    }
  }
  return count;
}

  public static void main(String[] args) {
    String s = new String("ssaccCC");
    System.out.println(countChar(s, 'c'));
  }
}



