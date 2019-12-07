package Intro2Java_Examples;

import java.util.Arrays;
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        // Welcome message
        System.out.println("Please input temperature values for the last seven days: ");

        // Let user input temperature values
        Scanner scanner = new Scanner(System.in);
        double[] temperatures = new double[7];
        for (int i = 0; i < 7; i++){
            temperatures[i] = scanner.nextDouble();
        }

        // Compute the average temperature
        double tempSum = 0.0;
        for (double temp:temperatures){
            tempSum = tempSum + temp;
        }
        double tempAvg = tempSum / 7;

        // Print out the result
        System.out.println("The average temperature of the last seven days is " + String.format("%.1f",tempAvg) + " degrees.");
    }
}
