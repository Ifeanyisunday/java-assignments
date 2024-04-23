import java.util.ArrayList;
import java.util.Scanner;
public class FireDrill1{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);

	int[] scores = new int[10];

	System.out.println("Enter 10 scores: ");

	for(int i = 1; i < scores.length; i++){		
		int scoreInput = input.nextInt();
		scores[i] = scoreInput;
	}

	}




}