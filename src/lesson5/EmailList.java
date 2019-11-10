package lesson5;

import java.util.ArrayList;
import java.util.List;

public class EmailList {
  public static void main(String[] args) {
    List<String> javaStudentEmails =
        List.of("student@redi.de", "my@email.com", "some@mail.de");
    List<String> pythonStudentEmails =
        List.of("another@mail.de", "student@redi.de");

    List<String> allStudentEmails = new ArrayList<>();

    allStudentEmails.addAll(javaStudentEmails);
    allStudentEmails.addAll(pythonStudentEmails);

    System.out.println(allStudentEmails.toString());
  }
}
