package chapter07;

public class VehicleDemo {
  public static void main(String[] args) {
//    Vehicle은 앞으로간다. 뒤로간다. 메서드기능
//    Car
//    FireTruck = 물을 뿜는다.
//    Ambulance = 싸이렌을 울린다.
//    V v1 = new FireTruck()
//    V v2 = new Ambulance()

    Vehicle v1 = new FireTruck();
    Vehicle v2 = new Ambulance();
    Vehicle v3 = new NomalCar();

    action(v3);
    action(v1);
    action(v2);



  }

  static void action(Vehicle vehicle) {
    if (vehicle instanceof FireTruck) {
      ((FireTruck) vehicle).water();
    } else if (vehicle instanceof Ambulance) {
      ((Ambulance) vehicle).siren();
    } else if (vehicle instanceof NomalCar) {
        vehicle.forward();
      }
    }
  }



interface Vehicle {
  void forward();

  void backward();
};

  class NomalCar implements Vehicle {
    @Override
    public void forward() {
      System.out.println("앞으로간다");
    }

    @Override
    public void backward() {
      System.out.println("뒤로간다");
    }
  }

  class FireTruck extends NomalCar{

    @Override
    public void forward() {
      super.forward();
    }

    @Override
    public void backward() {
      super.backward();
    }

    void water() {
      System.out.println("물을 뿜는다");

    }
  }

  class Ambulance extends NomalCar{
    @Override
    public void forward() {
      super.forward();
    }

    @Override
    public void backward() {
      super.backward();
    }

    void siren() {
      System.out.println("사이렌을 울린다");
    }
  }



