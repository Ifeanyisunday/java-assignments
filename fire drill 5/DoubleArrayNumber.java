import java.util.Arrays;
public class DoubleArrayNumber{
	public static void main(String... args){
	
	int[] numbers = {4, 5, 8};
	int[] result = doubleNo(numbers);
	System.out.print(Arrays.toString(result));

	}


        public static int[] doubleNo(int[] numbers){

	int[] doubler = new int[3];

	int multiply = 0; 		
	int constant = 2;
	for(int i = 0; i < numbers.length; i++){
		multiply = numbers[i] * constant; 
		doubler[i] = multiply;	
	}

	int[] output = new int[6];

	for(int j = 0; j < numbers.length; j++){
		output[j] = numbers[j];	
	}

	int count = 0;
	for(int a = 3; a < output.length; a++){
		output[a] = doubler[count];
		count++;	
	}

	return output;

}
}