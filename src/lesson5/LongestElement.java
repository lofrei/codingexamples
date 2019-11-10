package lesson5;

import java.util.List;

public class LongestElement {
  static String longestElement(List<String> list) {
    String candidate = null;
    for (String element: list) {
      if (candidate == null || candidate.length() < element.length()) {
        candidate = element;
      }
    }
    return candidate;
  }

  public static void main(String[] args) {
    System.out.println(longestElement(List.of("Mad", "Max", "I'm the longest!", "But I'm also long!", "Hooray!")));
  }
}
