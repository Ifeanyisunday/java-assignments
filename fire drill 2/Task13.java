import java.util.Arrays;
public class Task13{
	public static void main(String... args){

	int[] digits = {2, 31, 55, 3, 4, 23, 42, 7, 6, 10};

	int[] result = outputArray(digits);

	System.out.print(Arrays.toString(result));
	
	}

	
	public static int[] outputArray(int[] numbers){
		int[] swap = new int[numbers.length];
		/*for(int i = 1; i < numbers.length; i+=2){
				swap[count] = numbers[i];
				count+=2;
		}*/

                /*{2, 31, 55, 3, 4, 23, 42, 7, 6, 10};*/
		
		int index = 0;
		int count = 5;
		for(int i = 0; i < numbers.length; i++){
			if(numbers[i] % 2 == 0){
				swap[index] = numbers[i];

			}else {
				swap[count] = numbers[i];
			}
			count++;
			index++;		
		}
		
		return swap; 	

	} 

}