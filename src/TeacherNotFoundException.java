public class TeacherNotFoundException extends Throwable {

  public TeacherNotFoundException(String subjectTeacher) {
    super(String.format("Teacher with this subject teacher %s not found", subjectTeacher));
  }
}
