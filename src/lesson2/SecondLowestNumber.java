package lesson2;

public class SecondLowestNumber {
    // Solution provided by student Lanre
    public static void main(String [] args){
        int [] a = {44, 0, 66, 99, 77, 33, 22, 55, 0, 0, 88, 11};
        int smallest = Integer.MAX_VALUE; // a[0] could also be used
        int secondsmallest = Integer.MAX_VALUE;
        for(int i = 0; i < a.length; i++){
            if(a[i] < smallest){
                smallest = a[i];
            }
            else if(a[i] > smallest && a[i] < secondsmallest){
                secondsmallest = a[i];
            }
        }
        System.out.println(secondsmallest);
    }
}
