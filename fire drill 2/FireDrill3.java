import java.util.ArrayList;
import java.util.Scanner;
public class FireDrill3{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);

	int[] scores = new int[10];

	for(int i = 0; i < scores.length; i++){
		System.out.print("Enter scores: ");
		
		int scoreInput = input.nextInt();
		scores[i] = scoreInput;
	}
	
	for(int j = 0; j < scores.length; j++){
		System.out.printf("%4d", scores[j]);	
	}
	
	}




}