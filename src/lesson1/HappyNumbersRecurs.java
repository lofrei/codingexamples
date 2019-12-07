package lesson1;

public class HappyNumbersRecurs {

    public static void main(String[] args){
        for (int i=10; i<=20; i++){
            if (isHappy(i)){
                System.out.println(i + " is happy :-)");
            }
            else{
                System.out.println(i + " is sooooo unhappy :-(");
            }
        }
    }

    public static boolean isHappy(int i){
        int pcs = powerCheckSum(i);
        while (pcs > 9){
            pcs = powerCheckSum(pcs);
        }
        if (pcs == 1){
            return true;
        }
        else {
            return false;
        }
    }

    public static int powerCheckSum(int i){
        int head = i/10;
        int tail = i%10;
        if (head<10){
            return tail*tail + head*head;
        }
        else{
            return tail*tail + powerCheckSum(head);
        }
    }
}
