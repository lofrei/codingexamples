package lesson5;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmailSet {
  public static void main(String[] args) {
    List<String> javaStudentEmails =
        List.of("student@redi.de", "my@email.com", "some@mail.de");
    List<String> pythonStudentEmails =
        List.of("another@mail.de", "student@redi.de");

    Set<String> javaStudentEmailsSet = new HashSet<>(javaStudentEmails);
    Set<String> pythonStudentEmailsSet = new HashSet<>(pythonStudentEmails);

    Set<String> allStudentEmails = new HashSet<>();
    allStudentEmails.addAll(javaStudentEmailsSet);
    allStudentEmails.addAll(pythonStudentEmailsSet);

    System.out.println(allStudentEmails);
  }
}
