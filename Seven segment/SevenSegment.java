import java.util.Scanner;
public class SevenSegment{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);

	System.out.println("Enter a digit you want to display: ");
	String digit = input.nextLine();
	int i = Integer.parseInt(digit);

	switch(i){
		case 1111110:
			System.out.println(" _\n| |\n|_|");
			break;
		case 0110000:
			System.out.println(" \n |\n |");
			break;
		case 1101101:
			System.out.println(" _\n _|\n|_");
			break;
		case 1111001:
			System.out.println(" _ \n _|\n _|");
			break;
		case 0110011:
			System.out.println(" \n|_|\n |");
			break;
		case 1011011:
			System.out.println(" _\n|_\n _|");
			break;
		case 1011111:
			System.out.println(" _\n|_\n|_|");
			break; 
		case 1110000:
			System.out.println(" _\n  |\n  |");
			break; 
		case 1111111:
			System.out.println(" _\n|_|\n|_|");
			break; 
		case 1110011:
			System.out.println(" _\n|_|\n _|");
			break;               


	}
	}

  

}