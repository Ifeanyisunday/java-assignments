
import java.util.Arrays;
import java.util.Scanner;
public class StundentGrade{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	
	System.out.println("How many students do you have?");
	int students = input.nextInt();

	System.out.println("How many subjects do they offer?");
	int subjects = input.nextInt();
	
	int count = 1;
	int index = 1;
	int[][] gradeCollector = new int[students][subjects];
	int[] studentTotal = new int[students];
	float[] average = new float[students];
	for(int i = 0; i < students; i++){
		System.out.println("Enter score for student " + count);
		for(int j = 0; j < subjects; j++){
				System.out.println("Enter score for subject " + index);
				int scoreCollector = input.nextInt();
				gradeCollector[i][j] = scoreCollector;
				studentTotal[i] += scoreCollector;
				index++;
		}
		average[i] = studentTotal[i] / (float)subjects;
		count++;
		index = 1;
	}

	
System.out.println("===============================================================================");
System.out.printf("%s%8s%5s%5s%7s%5s%5s%n", "STUDENT", "SUB1", "SUB2","SUB3", "TOTAL", "AVE", "POS");
int counter = 1;
int largest = 0;
for(int i = 0; i < students; i++){
	System.out.printf("%s%d", "student ",counter);
	for(int j = 0; j < subjects; j++){
	System.out.printf("%5d",gradeCollector[i][j]);
	}
	System.out.printf("%5d%8.2f",studentTotal[i],average[i]);
	for(int j = students; j > 0; j--){
		 
	}
	counter++;
}
System.out.println("===============================================================================");
System.out.println("===============================================================================\n");

}

public static int getPosition(int[] studentTotal){
	

}	




}