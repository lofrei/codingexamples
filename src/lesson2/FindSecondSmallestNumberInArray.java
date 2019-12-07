package lesson2;

public class FindSecondSmallestNumberInArray {
    public static void main(String args[]) {

        // Test cases
        //int myNumbers[] = {44,0,66,99,77,33,22,55,88,11};
        int myNumbers[] = {44, 0, 66, 99, 77, 33, 22, 55, 0, 0, 88, 11};
        //int myNumbers[] = {0,0,0,0,0,0};
        //int myNumbers[] = {0,42};
        //int myNumbers[] = {42};
        //int myNumbers[] = {};

        if (myNumbers.length < 2){
            System.out.println("Sorry, there have to be at least 2 elements in your array!");
        }
        else {
            System.out.println("Second smallest number is: " + getSecondSmallest(myNumbers));
        }
        System.out.println("I have these numbers in my array: ");
        for (int n : myNumbers) {
            System.out.print(n +"  ");
        }
    }

    public static int getSecondSmallest(int[] numbers) {
        // Sorting the array with bubble sort
        int temp;
        for (int i = 0; i < numbers.length; i++){
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        // Find second smallest number in sorted array
        int smallest = numbers[0];
        int secondSmallest = numbers[1];
        for (int i = 2; i < numbers.length; i++){
            if (secondSmallest != smallest){
                return secondSmallest;
            }
            else {
                secondSmallest = numbers[i];
            }
        }
        return secondSmallest;
    }
}
