import java.util.Scanner;
import java.util.Arrays;
public class ArrayKata{

	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	
	int[] numbers = {12, 3, 14, 10, 13};
	/*int number = input.nextInt();*/
	int[] result = squareNumberIn(numbers);
	System.out.println(Arrays.toString(result));

	}

	public static int maximunIn(int[] number){
		int maximum = 0;
		for(int i = 0; i < number.length; i++){
			if(number[i] > maximum){
				maximum = number[i];
			}	
		}
		return maximum;
	}
	
	
	public static int minimunIn(int[] number){
		int minimum = 0;
		if(number[0] > minimum){
				minimum = number[0];
		}

		for(int i = 1; i < number.length; i++){
			if(number[i] < minimum){
				minimum = number[i];
			}	
		}
		return minimum;
	}

	
	public static int sumOf(int[] number){
		int sum = 0;
		for(int i = 0; i < number.length; i++){
			sum += number[i];		
		}
		return sum;
	}

	public static int sumOfEvenNumbersIn(int[] number){
		int evenNumber = 0;
		for(int i = 0; i < number.length; i++){
			if(number[i] % 2 == 0){
				evenNumber += number[i];
			}		
		}
		return evenNumber;
	}

	public static int sumOfOddNumbersIn(int[] number){
		int oddNumber = 0;
		for(int i = 0; i < number.length; i++){
			if(number[i] % 2 != 0){
				oddNumber += number[i];
			}		
		}
		return oddNumber;
	}

	public static int[] maximumAndMinimunOf(int[] numbers){
		int minimum = 0;
		int maximum = 0;
		int[] result = new int[2];
		
		for(int i = 0; i < numbers.length; i++){
			if(numbers[i] > maximum){
				maximum = numbers[i];
			}	
		}
		result[0] = maximum;

		
		if(numbers[0] > minimum){
				minimum = numbers[0];
		}

		for(int j = 1; j < numbers.length; j++){
			if(numbers[j] < minimum){
				minimum = numbers[j];
			}	
		}
		result[1] = minimum;

		return result;
	}


	public static int onOfOddNumbersIn(int[] number){
		int oddNumber = 0;
		for(int i = 0; i < number.length; i++){
			if(number[i] % 2 != 0){
				oddNumber += 1;
			}		
		}
		return oddNumber;
	}

	public static int onOfEvenNumbersIn(int[] number){
		int evenNumber = 0;
		for(int i = 0; i < number.length; i++){
			if(number[i] % 2 == 0){
				evenNumber += 1;
			}		
		}
		return evenNumber;
	}

	public static int[] evenNumberIn(int[] numbers){
		int[] result = new int[2];
		
		for(int i = 0; i < numbers.length; i++){
			if(numbers[i] % 2 == 0){
				result[i] = numbers[i];
			}	
		}
		return result;
	}

	public static int[] oddNumberIn(int[] numbers){
		int[] result = new int[3];
		
		for(int i = 0; i < numbers.length; i++){
			if(numbers[i] % i != 0){
				result[i] = numbers[i];
			}	
		}
		return result;
	}

	public static int[] squareNumberIn(int[] numbers){
		int[] result = new int[numbers.length];
		
		for(int i = 0; i < numbers.length; i++){
			if(numbers[i] % i == 0 && numbers[i] % i == i){
				result[i] = numbers[i];
			}	
		}
		return result;
	}






}