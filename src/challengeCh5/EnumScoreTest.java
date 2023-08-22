package challengeCh5;

import java.util.Arrays;
import java.util.Scanner;

public class EnumScoreTest {
  public static void main(String[] args) {
    int numOfStudents = 0;
//  String grade = "";
    Grade grade;

    Scanner in = new Scanner(System.in);
    System.out.println("학생 수 입력 : ");
    numOfStudents = in.nextInt();
    int[] scores = new int[numOfStudents];
    for (int i = 0; i < numOfStudents; i++) {
      System.out.println("학생의 점수를 입력하세요");
      scores[i] = in.nextInt();
    }
    System.out.println(Arrays.toString(scores));

    for (int i = 0; i < scores.length; i++) {
    /*  if (scores[i] >= 90) {
        grade = "A";
      } else if (scores[i] >= 80) {
        grade = "B";
      } else{
        grade = "C";
      } */  if (scores[i] >= 90) {
        grade = Grade.A;
      } else if (scores[i] >= 80) {
        grade = Grade.B;
      } else{
        grade = Grade.C;
      }
      /*System.out.printf("%d번째 학생의 점수는 %d, 등급은 %s입니다.\n",
              i+1, scores[i], grade);*/
      System.out.printf("%d번째 학생의 점수는 %d, 등급은 %s입니다.\n",
              i+1, scores[i], grade, grade.getGrade());
    }

  }
}
