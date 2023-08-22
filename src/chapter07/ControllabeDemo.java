package chapter07;

public class ControllabeDemo {
  public static void main(String[] args) {
    /*TV tv1 = new TV();
    tv1.turnOn();
    tv1.turnOff();
    tv1.repair();
//  tv1.resrt();
    Controllable.reset();

    TV tv2 = new TV();
    tv2.RemoteOn();
    tv2.RemoteOff();

    Computer computer = new Computer();
    computer.turnOn();
    computer.turnOff();
    computer.repair();
//  computer.resrt();
    Controllable.reset();

    NoteBook noteBook = new NoteBook();
    noteBook.turnOn();
    noteBook.turnOff();
    noteBook.inMyBag();
*/
    Controllable[] controllables = {
            new TV(),
            new Computer(),
            new NoteBook()
    };

    for (Controllable controllabe : controllables) {
      controllabe.turnOn();
      controllabe.turnOff();
      controllabe.repair();
      Controllable.reset();

    }




  }
}
