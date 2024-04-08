<<<<<<< HEAD
import java.util.Scanner;

public class SumDigits {
	public static void main(String... args){

	Scanner input = new Scanner(System.in);
	
	System.out.println("");
	System.out.println("Enter a number between 0 and 1000: ");	 
	
	System.out.println("Enter integer: ");
	int number1 = input.nextInt();
	int digit1 = number1 % 10;

	int number2 = number1 / 10;
	int digit2 = number2 % 10;

	int number3 = number2 / 10;
	int digit3 = number3 % 10;

	int sumAllDigits = digit1 + digit2 + digit3;
	System.out.println("");
	System.out.println("The sum of the digits is " + sumAllDigits);


}

=======
import java.util.Scanner;

public class SumDigits {
	public static void main(String... args){

	Scanner input = new Scanner(System.in);
	
	System.out.println("");
	System.out.println("Enter a number between 0 and 1000: ");	 
	
	System.out.println("Enter integer: ");
	int number1 = input.nextInt();
	int digit1 = number1 % 10;

	int number2 = number1 / 10;
	int digit2 = number2 % 10;

	int number3 = number2 / 10;
	int digit3 = number3 % 10;

	int sumAllDigits = digit1 + digit2 + digit3;
	System.out.println("");
	System.out.println("The sum of the digits is " + sumAllDigits);


}

>>>>>>> ead790bad34f7d5e5305c429a0529f36db284fb9
}