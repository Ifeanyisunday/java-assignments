public class Kata{
	public static boolean isEven(int number){
		if (number % 2 == 0){
			return true;
		}else {
			return false;
		}	
	}

	public static boolean isPrimeNumber(int number){
		int factor = 0;
		for(int count = 1; count <= number; count++){
			if (number % count == 0){
				factor += 1;
			}
		}
		if(factor == 2){
			return true;	
		}else {
			return false;
		}	
	}

	public static int subtract(int number1, int number2){
		
		int firstSubstraction = number1 - number2;
		int secondSubstraction = number2 - number1;

		if(number1 >= number2){
			return firstSubstraction;	
		}else {
			return secondSubstraction;
		}
	}	

	public static float divide(int number1, int number2){
		
		float firstDivision = (float)number1 / number2;
		return firstDivision;
	}

	
	public static int factorOf(int number){
		int factor = 0;
		for(int index = 1; index <= number; index++){
			if (number % index == 0){
				factor += 1;
			}
		}
		return factor;
	}



	public static long factorialOf(int number){
		int factorial = 1;
		for(int i = 1; i <= number; i++){
			factorial *= i;
		}
		return factorial;
	}	
	

}