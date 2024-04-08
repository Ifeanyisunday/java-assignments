import java.util.Scanner;

public class Task6{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	
	int evenTotal = 0;
	int numberOfEven = 0;
	
	for(int count = 1; count <= 10; count++){
		System.out.println("Enter score: ");
		int score = input.nextInt();
		
		if(score % 2 == 0){
			evenTotal += score;
			numberOfEven += 1;
		}
	}
	
	int average = evenTotal / numberOfEven;
		
	System.out.println("the average of the even numbers is "+ average);
}
}