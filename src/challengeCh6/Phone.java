package challengeCh6;

class Phone {
  protected String owner;
  Phone(String owner) {
    this.owner = owner;
  }
  void talk() {
    System.out.println(owner + "가 통화 중이다.");
  }
}

class Telephone extends Phone {
  private String when;
  Telephone(String owner, String when) {
    super(owner);
    this.when = when;
  }
  void autoAnswering() {
    System.out.println(owner + "가 없다. " + when + "전화 줄래.");
  }
}

class Smartphone extends Telephone {
  private String game;
  Smartphone(String owner, String game) {
    super(owner,"when");
    this.game = game;
  }
  void playGame() {
    System.out.println(owner + "가 " + game + " 게임을 하는 중이다.");
  }
}




