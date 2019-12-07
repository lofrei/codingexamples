package Intro2Java_Examples;

import java.util.Scanner;

class RectangleArea {
    public static void main(String[] args) {
        System.out.println("Enter rectangle length: ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        System.out.println("Enter rectangle width: ");
        int width = scanner.nextInt();
        int area = length * width;
        System.out.println("The area of your rectangle is " + area);
    }
}