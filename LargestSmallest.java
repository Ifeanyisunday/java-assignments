import java.util.Scanner;

public class LargestSmallest {
		public static void main(String[] args) {
	   
		Scanner input = new Scanner(System.in);
		System.out.println("how many numbers do you want to enter: ");
		int range = input.nextInt();

		int largest = 0;
		int smallest = 0;

		for(int count = 0; count < range; count++){
		System.out.println("Enter number: ");
		int number = input.nextInt();		
		smallest = number;
		
		if(number > largest){
		largest = number;
		}
		
		if(number < smallest){
		 smallest = number;
		}
		}

		
		System.out.println("the largest number is " + largest); 
		System.out.println("the smallest number is " + smallest); 


} 
} 