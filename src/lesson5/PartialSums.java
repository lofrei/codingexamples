package lesson5;

import java.util.ArrayList;
import java.util.List;

public class PartialSums {
  static List<Integer> partialSums(List<Integer> list) {
    List<Integer> output = new ArrayList<>();
    int sum = 0;
    for (int element: list) {
      sum += element;
      output.add(sum);
    }
    return output;
  }

  public static void main(String[] args) {
    System.out.println(partialSums(List.of(1, 5, 2, 4)));
  }
}
