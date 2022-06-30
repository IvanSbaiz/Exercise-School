import java.util.HashMap;
import java.util.Map;

public class Student {

  private final String name;
  private final String surname;

  private final int birthDate;
  private final String taxCode;

  private final Map<Subject, Grades> grade;


  public Student(String name, String surname, int birthDate, String taxCode) {
    this.name = name;
    this.surname = surname;
    this.birthDate = birthDate;
    this.taxCode = taxCode;
    this.grade = new HashMap<Subject, Grades>();
  }

  public String getName() {
    return name;
  }

  public String getSurname() {
    return surname;
  }

  public String getTaxCode() {
    return taxCode;
  }

  public int getBirthDate() {
    return birthDate;
  }
}
