package lesson5;

import java.util.ArrayList;
import java.util.List;

public class UniqueEmailList {
  static void addUnique(List<String> sourceList, List<String> targetList) {
    for (String email : sourceList) {
      if (!targetList.contains(email)) {
        targetList.add(email);
      }
    }
  }

  public static void main(String[] args) {
    List<String> javaStudentEmails =
        List.of("student@redi.de", "my@email.com", "some@mail.de");
    List<String> pythonStudentEmails =
        List.of("another@mail.de", "student@redi.de");

    List<String> allStudentEmails = new ArrayList<>();

    addUnique(javaStudentEmails, allStudentEmails);
    addUnique(pythonStudentEmails, allStudentEmails);

    System.out.println(allStudentEmails.toString());
  }
}
