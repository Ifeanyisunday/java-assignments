import java.util.ArrayList;
import java.util.Scanner;
public class CreditCardValidator{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	
	/*ArrayList<Integer>groupOfNumbers = new ArrayList<Integer>();*/
	
	int[] arrayNumber = new int[16];
	Integer numbers = 0;
	System.out.println("Hello, kindly Enter card details to verify");
	

	
	String index = input.nextLine();
	numbers = Integer.valueOf(index.charAt(0));
	arrayNumber[0] = numbers;
	
	numbers = Integer.valueOf(index.charAt(1));
	arrayNumber[1] = numbers;

	numbers = Integer.valueOf(index.charAt(2));
	arrayNumber[2] = numbers;

	numbers = Integer.valueOf(index.charAt(3));
	arrayNumber[3] = numbers;

	numbers = Integer.valueOf(index.charAt(4));
	arrayNumber[4] = numbers;

	numbers = Integer.valueOf(index.charAt(5));
	arrayNumber[5] = numbers;

	numbers = Integer.valueOf(index.charAt(6));
	arrayNumber[6] = numbers;

	numbers = Integer.valueOf(index.charAt(7));
	arrayNumber[7] = numbers;

	numbers = Integer.valueOf(index.charAt(8));
	arrayNumber[8] = numbers;

	numbers = Integer.valueOf(index.charAt(9));
	arrayNumber[9] = numbers;

	numbers = Integer.valueOf(index.charAt(10));
	arrayNumber[10] = numbers;

	numbers = Integer.valueOf(index.charAt(11));
	arrayNumber[11] = numbers;
	
	numbers = Integer.valueOf(index.charAt(12));
	arrayNumber[12] = numbers;

	numbers = Integer.valueOf(index.charAt(13));
	arrayNumber[13] = numbers;

	numbers = Integer.valueOf(index.charAt(14));
	arrayNumber[14] = numbers;

	numbers = Integer.valueOf(index.charAt(15));
	arrayNumber[15] = numbers;


	if(arrayNumber[0] == 4){
		System.out.println("Credit card type: Visa Cards");
	}else if(arrayNumber[0] == 5){
		System.out.println("Credit card type: MasterCard");
	}else if(arrayNumber[0] == 37){
		System.out.println("Credit card type: American Express Card");
	}else if(arrayNumber[0] == 6){
		System.out.println("Credit card type: Discover Cards");
	}

	System.out.print("Credit Card Number: ");

	/*for(int i = 0; 1 < arrayNumber.length; i++){
		System.out.print(arrayNumber[i]);
	}*/


        int total = 0;
	int getSingle = 0;
	int getSingle1 = 0;
	int multiply;
	int sumSingleDigits;
	

	for(int i = 0; i < arrayNumber.length; i+=2){
		multiply = arrayNumber[i] * 2;

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

	for(int i = 0; i < arrayNumber.length; i++){
		if(i % 2 != 0){
			sumOddPlaces += arrayNumber[i];	
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