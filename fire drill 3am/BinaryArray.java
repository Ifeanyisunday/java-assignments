import java.util.Arrays;
public class BinaryArray{
	public static void main(String... args){

	int[] digits = {4, 5, 8, 8, 8, 2, 9};

	int[] result = evenToZeros(digits);

	System.out.print(Arrays.toString(result));
	
	}


public static int[] evenToZeros(int[] numbers){
	int[] binary = new int[7];

	for(int i = 0; i < numbers.length; i++){
		if(numbers[i] % 2 == 0){
			binary[i] = 0;
		}else {
			binary[i] = 1;
		}
	}
	
	return binary;

}



}