import java.util.Scanner;
public class FireDrillSum6{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);

	int[] numbers = {2, 31, 55, 3, 4, 23, 42, 7, 6, 1};

	int result = outputArray(numbers);

	System.out.print("the sum of even index is " + result);
	
	}

	
	public static int outputArray(int[] numbers){

	int sum = 0;
		
	for(int i = 0; i < numbers.length; i++){
			if(i % 2 == 0){
				sum = sum + numbers[i];
			}
		} 	
		
		return sum;

	} 


}