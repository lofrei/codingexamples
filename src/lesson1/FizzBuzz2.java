package lesson1;

class FizzBuzz2 {
	public static void main(String[] args){
		for (int i=1; i<=100; i++){
			
			if (i%3 == 0 && i%5 == 0){
				System.out.println("FizzBuzz");
			}
			else if (i%3 == 0){
				System.out.println("Fizz");
			}
			else if (i%5 == 0){
				System.out.println("Buzz");
			}		
			else if ((i/10 == 3 || i%10 == 3) && (i/10 == 5 || i%10 == 5)) {
				System.out.println("FizzBuzz");
			}
			else if (i/10 == 3 || i%10 == 3) {
				System.out.println("Fizz");
			}
			else if (i/10 == 5 || i%10 == 5){
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
			/* Attention! 
				This solution produces some questionable results:
				Contemplate what happens to 35, 51, 54, 57.
				What is the reason for this behaviour?
				How could we solve it? See FizzBuzz3!
			*/
		}
	}
}