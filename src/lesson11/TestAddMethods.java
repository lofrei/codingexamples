package lesson11;

public class TestAddMethods {
    public static int add(int a, int b){
        return a+b;
    }

    public static int add(int a, int b, int c){
        return a+b+c;
    }

    public static double add(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        System.out.println(a + " + " + b + " = " + add(a,b));

        int c = 2;
        System.out.println(a + " + " + b + " + " + c + " = " + add(a,b,c));

        double e = 3.14159;
        double f = 6.5;
        System.out.println(e + " + " + f + " = " + add(e,f));

    }
}
