import java.util.Scanner;

public class Task5{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	
	int evenTotal = 0;
	
	for(int count = 1; count <= 10; count++){
		System.out.println("Enter score: ");
		int score = input.nextInt();
		
		if(score % 2 == 0){
			evenTotal += score;
		}
	}
		
	System.out.println("the sum of even numbers is "+ evenTotal);
}
}