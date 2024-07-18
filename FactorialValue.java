import java.util.Scanner;

public class FactorialValue {
	public static void main(String... args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter any number: ");
		int number = input.nextInt();
		int fac = number;

		int factorial = 1;
		while (number > 1) {
			factorial *= number;
			number--;
		}

		System.out.printf("%s%d!%s = %d", "The factorial of ", fac, " is", factorial);
	}
}