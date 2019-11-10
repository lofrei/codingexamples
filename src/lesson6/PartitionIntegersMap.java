package lesson6;

import java.util.*;

public class PartitionIntegersMap {
  static Map<Integer, Set<Integer>> partition(int n, List<Integer> list) {
    Map<Integer, Set<Integer>> result = new HashMap<>();
    for (int element: list) {
      int slot = element % n;
      if (result.get(slot) == null) {
        result.put(slot, new HashSet<>());
      }
      result.get(slot).add(element);
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(partition(3, List.of(2, 5, 3, 7)));
  }
}
