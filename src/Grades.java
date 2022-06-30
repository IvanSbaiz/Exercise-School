import java.util.HashSet;
import java.util.Set;

public class Grades {

  private final Set<Student> students;


  public Grades() {
    this.students = new HashSet<>();

  }

  public Student getStudent(String studentTaxCode) throws StudentNotFoundException {
    for (Student student : students) {
       if (student.getTaxCode().equals(studentTaxCode)) {
         return student;
       }
    }
    throw new StudentNotFoundException(studentTaxCode);
  }




}
