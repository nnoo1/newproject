package challengeCh5;

import java.util.Scanner;

public class Test5 {
//0~99 사이의 정수를 키보드에서 10개 입력받아 10 단위 간격의 히스토그램을 출력하는 프로그램을 작성하시오.
// 입력된 수가 음수이면 무시하시오. 예를 들어 위쪽처럼 10개의 정수가 입력되었을 때는 아래쪽처럼 히스토그램을 출력한다.
public static void main(String[] args) {
  int num;
  int[] arr = new int[10];

  Scanner input = new Scanner(System.in);
  System.out.println("숫자를 10개 입력하시오.");
  for (int i = 0; i < 10; i++) {
    num = input.nextInt();
    if(num >= 0) {
      arr[(num-1)/10]++;
    } else {

    }
  }

  for (int i = 0; i < 10; i++) {
    System.out.printf("%d ~ %d : ", (i*10), ((i+1)*10)-1);
    for(int j = 0; j < arr[i]; j++) {
      System.out.print("*");
    }
    System.out.print("\n");
  }
}


}