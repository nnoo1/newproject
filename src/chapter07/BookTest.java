package chapter07;

/*
가격 순서대로 정렬할 수 있는 Book 클래스와 다음 실행 결과가 나타나도록 테스트 프로그램을 작성하시오.
Book 클래스에는 int 타입의 price 필드가 있으며, 생성자와 필요한 메서드를 포함한다.
또 테스트 프로그램은 3개의 Book 객체로 구성된 Book 배열을 사용해 가격 순서대로 정렬한 후 출력한다.

배열 books를 정렬하려면 Arrays.sort(books)를 호출하면 된다.
*/

import java.util.Arrays;

public class BookTest {
  public static void main(String[] args) {
  Book[] books = {
          new Book(15000),
          new Book(50000),
          new Book(20000)
  };

  System.out.println("정렬 전");
  for (Book b : books)
    b.print();

  Arrays.sort(books);

  System.out.println("정렬 후");
  for (Book b : books)
    b.print();
}
}



class Book implements Comparable{
  int price;

  Book(int price) {
    this.price = price;
  }

  void print() {
    System.out.println("Book [price="+price+"]");
  }

  @Override
  public int compareTo(Object o) {
    Book book = (Book) o;

    if(this.price < book.price)
      return -1;
    else if (this.price > book.price)
      return 1;
    else
      return 0;
  }
}

