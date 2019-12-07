package Intro2Java_Examples;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        // Welcome message
        System.out.println("Welcome to play Lotto 6 aus 49".toUpperCase());

        // Let player select numbers
        Scanner scanner = new Scanner(System.in);
        int[] luckyNumbers = new int[6];
        System.out.println("Please select six lucky numbers between 1 and 49: ");

        int i=0;
        while (i<6) {
            int number = scanner.nextInt();
            if (number > 0 && number <= 49){
                luckyNumbers[i] = number;
                i = i+1;
            }
            else {
                System.out.println("Wrong number!");
            }
        }
        Arrays.sort(luckyNumbers);
        System.out.println("Your lucky numbers are: " + Arrays.toString(luckyNumbers));

        // Draw winning numbers
        int[] winningNumbers = new int[6];
        Random rand = new Random();
        i=0;
        while (i<6) {
            int number = rand.nextInt(49)+1;
            boolean isNew = true;
            for (int winningNumber:winningNumbers) {
                if (number == winningNumber) {
                    isNew = false;
                }
            }
            if (isNew) {
                winningNumbers[i] = number;
                i++;
            }
        }
        Arrays.sort(winningNumbers);
        System.out.println("The winning numbers are: " + Arrays.toString(winningNumbers));

        // Determine game result
        int rightNumbers = 0;
        for (int luckyNumber:luckyNumbers){
            for (int winningNumber:winningNumbers){
                if (luckyNumber == winningNumber){
                    rightNumbers++;
                }
            }
        }
        System.out.println("You have got " + rightNumbers + " numbers right.");
        switch (rightNumbers) {
            case 0:
            case 1:
            case 2:
                System.out.println("Sorry, this does not earn you a prize :-(");
                break;
            case 3:
                System.out.println("You won 12 Euro :-)");
                break;
            case 4:
                System.out.println("Congratulations! You won 54 Euro.");
                break;
            case 5:
                System.out.println("Yippee! You won 4900 Euro.");
                break;
            case 6:
                System.out.println("Hip, hip, hooray! You won 500.000 Euro.");
        }
        System.out.println("Thanks for playing Lotto. Hope you will play again!".toUpperCase());
    }
}
