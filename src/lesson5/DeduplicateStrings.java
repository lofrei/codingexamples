package lesson5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DeduplicateStrings {
  public static void main(String[] args) {
    Set<String> strings = new HashSet<>();
    Scanner in = new Scanner(System.in);
    while (true) {
      String input = in.nextLine();
      if ("".equals(input)) {
        break;
      }
      strings.add(input);
    }
    System.out.println(strings);
  }
}
