package Intro2Java_Examples;

import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
    }
}
