import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Subject {


  private final Set<Teacher> teachers;
  private final Map<String, Student> stringStudentMap;


  public Subject() {
    this.teachers = new HashSet<>();
    this.stringStudentMap = new HashMap<>();
  }

  public Teacher getTeacher(String subjectTeacher) throws TeacherNotFoundException {
    for (Teacher teacher : teachers) {
      if (teacher.getSubjectTeacher().equals(subjectTeacher)) {
        return teacher;
      }
    }
    throw new TeacherNotFoundException(subjectTeacher);
  }

}

