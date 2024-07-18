import java.util.Scanner;

public class Table {
	public static void main(String... args) {

		Scanner input = new Scanner(System.in);

		System.out.printf("%5s%8s%16s", "a", "b", "pow(a, b)\n");

		int a = 1;
		int b = 2;

		int counter = 1;
		while (counter <= 5) {
			counter++;
			double power = Math.pow(a, b);


			System.out.printf("%5d%8d      %-10.0f%n", a, b, power);
			a++;
			b++;


		}

	}
}