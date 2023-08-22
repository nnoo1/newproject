package chapter05;

public class Array1Ex {
  public static void main(String[] args) {
    int sum = 0;
    int avg = 0;
    int sc1 = 90;
    int sc2 = 80;
    int sc3 = 100;

    sum = sc1 + sc2 + sc3;
    avg = sum/3;

    //초기화
    sum = 0;
    avg = 0;
   /* int[] scores = new int[3];
    scores[0]=90;
    scores[1]=80;
    scores[2] = 100;*/
    int[] scores = {90,80,100,100,90};


    //sum = scores[0] + scores[1] + scores[2]; //또 반복이 되니까 재사용을 위한 반복문으로 아래처럼 바꿔보기~~
    for (int i = 0; i < scores.length; i++) {
      sum = sum + scores[i];
    }
    avg = sum / scores.length;
    System.out.printf("sum = %d, avg = %d\n ", sum, avg);

    System.out.println("------------------------쓰다가 부족하면..?");

    //쓰다가 부족하면..?
    int[] scoresBig = new int[5];
    for (int i = 0; i < scores.length; i++) {
      scoresBig[i] = scores[i];
    }
    scores = scoresBig;
    scores[3]=110;

    for (int i = 0; i < scores.length; i++) {
      System.out.println(scores[i]);
    }

    System.out.println("------------------------for each");

    for (int score : scores) {
      System.out.println(score);

    }

  }




}
