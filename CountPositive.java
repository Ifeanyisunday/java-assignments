
import java.util.Scanner;

public class CountPositive{
	public static void main(String... args){

	Scanner input = new Scanner(System.in);

	System.out.println("How many numbers should be entered: ");

	int userInput = input.nextInt();
	int counter = 1;
	int positive = 0;
	int negative = 0;
	int zero = 0;

	while(counter <= userInput){
	counter++;
	System.out.println("Enter number: ");

	int newInput = input.nextInt();

	if(newInput > 0){
		positive += 1;
	}else if(newInput < 0){
		negative += 1;
	}else if(newInput == 0){
		zero += 1;
	}
	}

	System.out.printf("The number of positive, negative and zeros entered are %3d%3d%3d", positive, negative, zero);
	/*System.out.print(positive, negative, zero, " respectively");*/
}}