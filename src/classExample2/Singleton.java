package classExample2;

public class Singleton {
  static Singleton singleton = new Singleton();
  private  Singleton(){

  }
  static Singleton getInstance(){
    return singleton;
  }

}
