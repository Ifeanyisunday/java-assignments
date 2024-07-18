import java.util.Scanner;

public class Numbers {
	public static void main(String... args) {

		Scanner input = new Scanner(System.in);


		boolean progress;

		do {
			System.out.println("");
			System.out.println("Enter first number: ");
			int number1 = input.nextInt();

			System.out.println("Enter second number: ");
			int number2 = input.nextInt();
			int sum = number1 + number2;
			System.out.println("");
			System.out.println("The sum of the first and second number is equals to " + sum);
			System.out.println("");
			System.out.println("Do you wish to perform the operation again?");
			System.out.println("");
			System.out.println("Enter True or false ");
			progress = input.nextBoolean();
			if (progress == true) {
				continue;
			} else if (progress == false) {
				break;
			}

		} while (progress == true);
	}
}