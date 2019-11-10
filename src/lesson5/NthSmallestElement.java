package lesson5;

import java.util.HashSet;
import java.util.Set;

public class NthSmallestElement {
  static int nthSmallestElement(Set<Integer> elements, int n) {
    if (elements.size() < n) {
      return Integer.MAX_VALUE;
    }
    Set<Integer> smallerElements = new HashSet<>();
    Set<Integer> largerElements = new HashSet<>();
    int pivot = getSomeElement(elements);
    for (int element : elements) {
      if (element < pivot) {
        smallerElements.add(element);
      } else if (element > pivot) {
        largerElements.add(element);
      }
    }
    if (smallerElements.size() == n - 1) {
      return pivot;
    } else if (smallerElements.size() < n - 1) {
      return nthSmallestElement(largerElements, n - 1 - smallerElements.size());
    } else {
      return nthSmallestElement(smallerElements, n);
    }
  }

  private static int getSomeElement(Set<Integer> elements) {
    for (int element : elements) {
      return element;
    }
    // This should never happen, but we have to return something.
    return 0;
  }

  public static void main(String[] argv) {
    Set<Integer> elements = Set.of(2, 6, 3, 10, 7, 15, 5, 4);
    System.out.println("The elements is " + elements);
    System.out.println("The smallest element is " + nthSmallestElement(elements, 1));
    System.out.println("The third smallest element is " + nthSmallestElement(elements, 3));
    System.out.println("The fifth smallest element is " + nthSmallestElement(elements, 5));
    System.out.println("The tenth smallest element is " + nthSmallestElement(elements, 10));
  }
}
