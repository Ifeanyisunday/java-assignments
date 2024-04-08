import java.util.Scanner;

public class Task2{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	
	int sum = 0;
	
	for(int count = 1; count <= 10; count++){
		System.out.println("Enter score: ");
		int score = input.nextInt();
		
		sum += score;	
	}

	int average = sum / 10;
	System.out.println("Total is " + sum);
	System.out.println("Average is " + average);
	}

}