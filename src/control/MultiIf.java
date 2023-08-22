package control;

import java.util.Scanner;

public class MultiIf {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("점수를 입력해주세요(0~100)");
    int score = in.nextInt();
    String grade = "";
    if (score >= 90) {
      if (score > 95) {
        grade = "A+";
      } else {
        grade = "A";
      }
    } else if (score >= 80) {
      if (score > 85) {
        grade = "B+";
      } else {
        grade = "B";
      }
    } else if (score >= 70) {
      if (score > 75) {
        grade = "C+";
      } else {
        grade = "C";
      }
    } else if (score >= 60) {
      if (score > 65) {
        grade = "D+";
      } else {
        grade = "D";
      }
    }
    System.out.println("당신의 점수는 : " + grade);
  }


}
