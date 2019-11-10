package lesson5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseList {
  public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    Scanner in = new Scanner(System.in);

    while (true) {
      String input = in.nextLine();
      if ("".equals(input)) {
        break;
      }
      names.add(input);
    }

    for (int i = names.size() - 1; i >= 0; --i) {
      System.out.println(names.get(i));
    }
  }
}
