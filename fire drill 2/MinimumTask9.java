public class MinimumTask9{
	public static void main(String... args){

	int[] digits = {2, 31, 55, 3, 4, 23, 42, 7, 6, 10};

	int result = outputArray(digits);

	System.out.print("the minimum of task five is " + result);
	
	}

	
	public static int outputArray(int[] numbers){
		int minimum = numbers[0];
		for(int i = 0; i < numbers.length; i++){
			if(i % 2 != 0){
				if(numbers[i] < minimum){
					minimum = numbers[i];
				}
			}
		} 	
		return minimum;

	} 


}