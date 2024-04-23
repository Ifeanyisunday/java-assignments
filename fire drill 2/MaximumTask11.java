public class MaximumTask11{
	public static void main(String... args){

	int[] digits = {2, 31, 55, 3, 4, 23, 42, 7, 6, 10};

	int result = outputArray(digits);

	System.out.print("the maximum of task five is " + result);
	
	}

	
	public static int outputArray(int[] numbers){
		int maximum = 0;
		for(int i = 0; i < numbers.length; i++){
			if(i % 2 != 0){
				if(numbers[i] > maximum){
					maximum = numbers[i];
				}
			}
		}
		return maximum; 	

	} 


}