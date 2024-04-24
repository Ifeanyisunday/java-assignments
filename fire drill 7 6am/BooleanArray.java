import java.util.Arrays;
public class BooleanArray{
	public static void main(String... args){

	int[] digits = {4, 5, 8, 8, 8, 2, 9};

	boolean[] result = evenToFalse(digits);

	System.out.print(Arrays.toString(result));
	
	}


public static boolean[] evenToFalse(int[] numbers){
	boolean[] statement = new boolean[7];

	for(int i = 0; i < numbers.length; i++){
		if(numbers[i] % 2 == 0){
			statement[i] = false;
		}else {
			statement[i] = true;
		}
	}
	
	return statement;

}



}