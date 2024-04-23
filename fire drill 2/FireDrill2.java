import java.util.ArrayList;
import java.util.Scanner;
public class FireDrill2{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);

	int[] scores = new int[10];

	for(int i = 0; i < scores.length; i++){
		System.out.print("Enter scores: ");
		
		int scoreInput = input.nextInt();
		scores[i] = scoreInput;
	}
	
	System.out.println(scores[0]);
	System.out.println(scores[1]);
	System.out.println(scores[2]);
	System.out.println(scores[3]);
	System.out.println(scores[4]);
	System.out.println(scores[5]);
	System.out.println(scores[6]);
	System.out.println(scores[7]);
	System.out.println(scores[8]);
	System.out.println(scores[9]);
	
	}




}