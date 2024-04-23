import java.util.Arrays;
import java.util.Scanner;
public class FireDrill4{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	
	int[] digits = {2, 31, 55, 3, 4, 23, 42, 7, 6, 1};


	int[] result = outputArray(digits);
	System.out.print(Arrays.toString(result));

	}


	public static int[] outputArray(int[] numbers){
		int[] even = new int[numbers.length / 2];
		int j = 0;
		for(int i = 0; i < numbers.length; i+=2){
			even[j] = numbers[i];
			j++;
		}
			
		return even;
	}


}