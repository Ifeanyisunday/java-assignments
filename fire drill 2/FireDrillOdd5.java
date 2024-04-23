import java.util.Arrays;
public class FireDrillOdd5{
	public static void main(String... args){

	int[] numbers = {2, 31, 55, 3, 4, 23, 42, 7, 6, 1};

	int[] result = outputArray(numbers);

	System.out.print(Arrays.toString(result));
	
	}

	
	public static int[] outputArray(int[] numbers){
		int[] odd = new int[numbers.length / 2];
		int j = 0;
		for(int i = 1; i < numbers.length; i+=2){
			odd[j] = numbers[i];
			j++;
		} 	
		return odd;

	} 


}