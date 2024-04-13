import java.util.Scanner;
public class CreditCardValidator{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	/*int userInput; 
	
	int[] credit = new int[16];
	
	System.out.println("Hello, kindly Enter card details to verify");
	for(int i = 0; i < 16; i++){
		userInput = input.nextInt();
		credit[i] = userInput;
	}
	
        int total = 0;
	int getSingle = 0;
	int getSingle1 = 0;
	int multiply;
	int sumSingleDigits;
	int[] creditNumbers = {4,3,8,8,5,7,6,0,1,8,4,0,2,6,2,6};
	for(int i = 0; i < 16; i+=2){
		multiply = credit[i] * 2;

		if(multiply / 10 != 0 && multiply % 10 != 0 || multiply % 10 == 0){
			getSingle = multiply / 10;
                        getSingle1 = multiply % 10;
 			sumSingleDigits = getSingle + getSingle1;
			total += sumSingleDigits;	
		}else {
			total += multiply;
		}
	}


	int sumOddPlaces = 0;

	for(int i = 0; i < 16; i++){
		if(i % 2 != 0){
			sumOddPlaces += credit[i];	
		}

	}

	int sum = total + sumOddPlaces;

	if(sum % 10 == 0){
		System.out.println("Valid");
	}else {
		System.out.println("Invalid");	
	}*/

	System.out.println("Hello, kindly Enter card details to verify");
	String numbers = input.nextLine();

	int result = validCard(numbers);
	System.out.print(result);
}

	public static String validCard(String numbers){
	
	ArrayList<Integer> digit = new ArrayList<Integer>();
	

	for(int i = 0; i < numbers.size(); i++){
		if(numbers.charAt(i) >= 0){
			digit(i) = numbers.charAt(i);
		}
	}

        int total = 0;
	int getSingle = 0;
	int getSingle1 = 0;
	int multiply;
	int sumSingleDigits;
	

	for(int i = 0; i < numbers.size(); i+=2){
		multiply = digit(i) * 2;

		if(multiply / 10 != 0 && multiply % 10 != 0 || multiply % 10 == 0){
			getSingle = multiply / 10;
                        getSingle1 = multiply % 10;
 			sumSingleDigits = getSingle + getSingle1;
			total += sumSingleDigits;	
		}else {
			total += multiply;
		}
	}


	int sumOddPlaces = 0;

	for(int i = 0; i < numbers.size(); i++){
		if(i % 2 != 0){
			sumOddPlaces += digit(i);	
		}
	}

	int sum = total + sumOddPlaces;

	if(sum % 10 == 0){
		System.out.println("Valid");
	}else {
		System.out.println("Invalid");	
	}


}

}