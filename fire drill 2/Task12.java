import java.util.Arrays;
public class Task12{
	public static void main(String... args){

	int[] digits = {2, 31, 55, 3, 4, 23, 42, 7, 6, 10};

	int[] result = outputArray(digits);

	System.out.print(Arrays.toString(result));
	
	}

	
	public static int[] outputArray(int[] numbers){
		int[] swap = new int[numbers.length];
		int count = 0;
		for(int i = 1; i < numbers.length; i+=2){
				swap[count] = numbers[i];
				count+=2;
		}

		int counter = 1;
		for(int i = 0; i < numbers.length; i+=2){
				swap[counter] = numbers[i];
				counter+=2;
				
		}
		
		return swap; 	

	} 


}