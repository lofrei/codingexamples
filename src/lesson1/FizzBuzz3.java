package lesson1;

class FizzBuzz3 {
	public static void main(String[] args){

		boolean fizz, buzz;
		for (int i=1; i<=100; i++){

			fizz = false;
			buzz = false;		

			if (i%3 == 0){
				fizz = true;
			}
			if (i%5 == 0){
				buzz = true;
			}
			if (i/10 == 3 || i%10 == 3) {
				fizz = true;
			}
			if (i/10 == 5 || i%10 == 5){
				buzz = true;
			}

			if (fizz && buzz ){
				System.out.println("FizzBuzz");
			}
			else if (fizz){
				System.out.println("Fizz");
			}
			else if (buzz){
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
		}
	}
}