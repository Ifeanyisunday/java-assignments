import java.util.Scanner;

public class Task9{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	
	int sum = 0;
	
	for(int count = 1; count <= 10; count++){
		System.out.println("Enter score between 0 - 100: ");
		int score = input.nextInt();
		
		if(score >= 0 && score <= 100){
			sum += score;
		}

	}
	System.out.println("the sum is "+ sum);
}
}