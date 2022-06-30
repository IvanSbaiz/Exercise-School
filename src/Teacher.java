public class Teacher {

  private final String name;
  private final String surname;

  private final String subjectTeacher;


  public Teacher(String name, String surname, String subjectTeacher) {
    this.name = name;
    this.surname = surname;
    this.subjectTeacher = subjectTeacher;
  }


  public String getName() {
    return name;
  }

  public String getSurname() {
    return surname;
  }

  public String getSubjectTeacher() {
    return subjectTeacher;
  }
}





