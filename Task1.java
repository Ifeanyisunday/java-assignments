import java.util.Scanner;

public class Task1{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	
	int sum = 0;
	
	for(int count = 1; count <= 10; count++){
		System.out.println("Enter score: ");
		int score = input.nextInt();
		
		sum += score;	
	}
	System.out.println("Sum is " + sum);
	}

}