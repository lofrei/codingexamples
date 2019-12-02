package lesson11;

public class VirtualDemo {

    public static void main(String [] args) {
        Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
        //Employee d = new Employee("Mary Adams", "Boston, MA", 2);

        System.out.println("\nCall mailCheck using Salary reference --");
        s.mailCheck();
        System.out.println("\nCall mailCheck using Employee reference--");
        e.mailCheck();
        //System.out.println("\nCall mailCheck using Employee reference and Employee object--");
        //d.mailCheck();
    }
}
