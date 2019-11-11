package lesson7;

// Example taken from https://www.tutorialspoint.com/java/java_polymorphism.htm
public class Animals {
    interface Vegetarian{}
    static class Animal{}
    static class Deer extends Animal implements Vegetarian{}

    public static void main(String[] args) {
        Deer d = new Deer();
        Animal a = d;
        Vegetarian v = d;
        Object o = d;

        if (d instanceof Deer){ System.out.println("d is a Deer");}
        if (a instanceof Deer){ System.out.println("a is a Deer");}
        if (v instanceof Deer){ System.out.println("v is a Deer");}
        if (o instanceof Deer){ System.out.println("o is a Deer");}
    }
}
