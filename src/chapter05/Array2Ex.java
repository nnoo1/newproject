package chapter05;

import java.util.Arrays;

public class Array2Ex {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};

    //for each 원소 하나씩 출력
    for (int a:arr) {
      System.out.println(a);
    }

    //배열에는 toString을 오버로딩되어있지 않기때문에 원소 통째로{1,2,3,4,5} 이렇게 안나옴
    System.out.println(arr);
    //Arrays의 도움받기
    System.out.println(Arrays.toString(arr));

    System.out.println("----------------문자를 원소로 갖는 배열");

    char[] cArr = {'a','b','c'};
    for (char c : cArr) {
      System.out.println(c);
    }
    //문자열은 예외로 가능....?
    System.out.println(cArr);

  }
}
