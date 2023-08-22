package challengeCh5;

public enum Grade {

  A("Excellent"),B("Good"),C("SoSo");

  private String grade;

  private Grade(String grade){
    this.grade = grade;
  }

  public String getGrade() {
    return grade;
  }



}
