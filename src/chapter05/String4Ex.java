package chapter05;

public class String4Ex {
  public static void main(String[] args) {
    String java = String.format("%s %d", "Java", 14);//원래        String.format("%s %d", "Java", 14);     >>   ctrl + alt + v
    System.out.println(java);

    String join = String.join(",", "apple", "banana");
    System.out.println(join);
    String s = String.valueOf(100_000_000_000L);
    System.out.println(s);
  }
}
