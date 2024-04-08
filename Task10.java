import java.util.Scanner;

public class Task10{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	
	int sum = 0;
	int noOfValidScore = 0;
	
	for(int count = 1; count <= 10; count++){
		System.out.println("Enter score between 0 - 100: ");
		int score = input.nextInt();
		
		if(score >= 0 && score <= 100){
			sum += score;
			noOfValidScore += 1;
		}

	}
	int average = sum / noOfValidScore;
	System.out.println("the average is "+ average);
}
}