package lesson5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PartitionIntegers {
  static List<Set<Integer>> partition(int n, List<Integer> list) {
    List<Set<Integer>> result = new ArrayList<>();
    for (int i = 0; i < n; ++i) {
      result.add(new HashSet<>());
    }
    for (int element: list) {
      result.get(element % n).add(element);
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(partition(3, List.of(2, 5, 3, 7)));
  }
}
