import java.util.Scanner;

public class Power {
	public static void main(String... args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter first number: ");
		int number1 = input.nextInt();

		System.out.println("Enter second number: ");
		int number2 = input.nextInt();

		int raisePower = 1;

		int counter = 1;
		while (counter <= number2) {
			counter++;
			raisePower *= number1;
		}

		System.out.println(number1 + " raise to power " + number2 + " is = " + raisePower);


	}
}