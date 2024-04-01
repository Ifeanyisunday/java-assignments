import java.util.Scanner;

public class BarChart {
	public static void main(String... args){

	Scanner input = new Scanner(System.in);
	
	
	System.out.println("");
	System.out.println("Enter five numbers between 1 and 30");
	int firstNumber = input.nextInt();
	int secondNumber = input.nextInt();
	int thirdNumber = input.nextInt();
	int fourthNumber = input.nextInt();
	int fifthNumber = input.nextInt();
	

	for(int counter = 1; counter == 1; counter++){
		for(int asterisk1 = 1; asterisk1 <= firstNumber; asterisk1++){
		System.out.print("*");
		}
		System.out.println("");

		for(int asterisk2 = 1; asterisk2 <= secondNumber; asterisk2++){
		System.out.print("*");
		}
		System.out.println("");
		
		for(int asterisk3 = 1; asterisk3 <= thirdNumber; asterisk3++){
		System.out.print("*");
		}
		System.out.println("");

		for(int asterisk4 = 1; asterisk4 <= fourthNumber; asterisk4++){
		System.out.print("*");
		}
		System.out.println("");

		for(int asterisk5 = 1; asterisk5 <= fifthNumber; asterisk5++){
		System.out.print("*");
		}

	}
      	


}

}