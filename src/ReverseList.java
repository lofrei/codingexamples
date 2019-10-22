import java.util.*;

public class ReverseList {
    public static void main(String[] args) {
        List<String> namelist = new ArrayList<>();
        System.out.println("Please enter names, enter empty line to stop: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        while (!name.equals("")) {
            namelist.add(name);
            name = scanner.nextLine();
        }
        System.out.println("Original Namelist: " + namelist);
        System.out.println("Namelist reversed manually: ");
        for (int i = namelist.size() - 1; i >= 0; i--) {
            System.out.println(namelist.get(i));
        }
        Collections.reverse(namelist);
        System.out.println("Namelist reversed using Collections method: " + namelist);
        Set<String> emails = new HashSet<>();
    }
}