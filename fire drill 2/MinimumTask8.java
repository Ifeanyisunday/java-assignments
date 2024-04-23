public class MinimumTask8{
	public static void main(String... args){

	int[] digits = {10, 31, 55, 3, 4, 23, 42, 7, 6, 1};

	int result = outputArray(digits);

	System.out.print("The minimum of task 4 is " + result);
	
	}


	public static int outputArray(int[] numbers){
		
		int minimum = numbers[0];
		for(int i = 0; i < numbers.length; i++){
			if(i % 2 == 0){
				if(numbers[i] < minimum){
					minimum = numbers[i];
				}
			}
			
		}

		return minimum;
	}

	



}