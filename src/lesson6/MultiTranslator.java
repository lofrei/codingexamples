package lesson6;

import java.util.*;

public class MultiTranslator {
  private final Map<String, Set<String>> dictionary = new HashMap<>();

  void addTranslation(String word, String translation) {
    if (!dictionary.containsKey(word)) {
      dictionary.put(word, new HashSet<>());
    }
    dictionary.get(word).add(translation);
  }

  Set<String> translate(String word) {
    if (dictionary.containsKey(word)) {
      return dictionary.get(word);
    } else {
      return Set.of("Sorry, I do not know that word");
    }
  }

  public static void main(String[] args) {
    MultiTranslator translator = new MultiTranslator();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Add words to the dictionary. Syntax word=>translation. Blank line ends.");
    while (true) {
      String input = scanner.nextLine();
      if ("".equals(input)) {
        break;
      }
      String[] parts = input.split("=>");
      translator.addTranslation(parts[0].trim(), parts[1].trim());
    }

    System.out.println("Enter words for translation. Blank line ends.");
    while (true) {
      String input = scanner.nextLine();
      if ("".equals(input)) {
        break;
      }
      System.out.println("Translation: " + translator.translate(input));
    }
  }
}
