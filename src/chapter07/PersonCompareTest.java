package chapter07;

import java.util.Arrays;
import java.util.Collections;

public class PersonCompareTest {
  public static void main(String[] args) {
    Person[] persons = {
             new Person("홍길동",32,170,75),
             new Person("박지성",40,175,60),
             new Person("손흥민",20,180,70),
    };

//  나이를 기준으로 나이가 가장 많은 사람부터 이름을 출력하시오.
//  두 가지 방법을 이용해서 나이가 많은 사람부터 출력하는 방법을 찾아보기
//  힌트 : 1. compareTo의 리턴값 변형
//        2. Arrays.sort 후 순서를 뒤집는 메서드 활용

    Arrays.sort(persons, Collections.reverseOrder());
    for (Person p : persons) {
      System.out.println(p);
    }

  }

}

class Person implements Comparable {
  String name;
  int age;
  int height;
  int weight;

  public Person(String name, int age, int height, int weight) {
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }
  void print(){
    System.out.printf("이름 : %d 나이 : %d, 키 : %d, 몸무게 : %d",name,age,height,weight);
  }

  @Override
  public int compareTo(Object o) {
    Person person = (Person) o;
    if (this.age<person.age)
      return -1;
    else if (this.age > person.age)
      return 1;
    else
      return 0;
    }

  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", height=" + height +
            ", weight=" + weight +
            '}';
  }
}


