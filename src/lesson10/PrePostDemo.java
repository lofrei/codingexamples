package lesson10;

// source https://docs.oracle.com/javase/tutorial/java/nutsandbolts/QandE/questions_operators.html
class PrePostDemo {
    public static void main(String[] args){
        int i = 3;
        i++;
        System.out.println(i);
        ++i;
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i++);
        System.out.println(i);
    }
}