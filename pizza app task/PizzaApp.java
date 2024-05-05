import java.util.Scanner;
public class PizzaApp{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	System.out.printf("%-" + 3 + "s%" + 6 + "s%" + 6 + "s%n", "Pizza type", "     Number of Slices", "     Price per box");

	String[] pizzaTypeList = {"Sapa size", "Small Money", "Big boys", "Odogwu"};
	int[] noOfSlice = {4, 6, 8, 12};
	int[] pricePerBox = {2000, 2400, 3000, 4200};

	for(int i = 0; i < noOfSlice.length; i++){
		System.out.printf("%-20s", pizzaTypeList[i]);
  		System.out.printf("%-20d", noOfSlice[i]);
  		System.out.printf("%-20d%n", pricePerBox[i]);
	}

	System.out.println("");
	System.out.println("Enter number of guests: ");
	int buyerGuest = input.nextInt();

	
	input.nextLine();
	System.out.println("Enter pizza type: ");
	String pizzaType = input.nextLine();

	int divisor = 0;
	int price = 0;
	switch(pizzaType){
		case "sapa size":
				divisor = noOfSlice[0];
				price = pricePerBox[0];
				break;
		case "small money":
				divisor = noOfSlice[1];
				price = pricePerBox[1];
				break;
		case "big boys":
				divisor = noOfSlice[2];
				price = pricePerBox[2];
				break;
		case "odogwu":
				divisor = noOfSlice[3];
				price = pricePerBox[3];
				break;
		default:
			while(pizzaType != "sapa size" || pizzaType != "small money" || pizzaType != "big boys" || pizzaType != "odogwu"){
				System.out.println("Invalid input! please enter correct pizza type");
				pizzaType = input.nextLine();
			}
	}
		

	double cal = buyerGuest / (double)divisor;
	double convertTodecimal = Math.ceil(cal);
	int numberOfBoxes = (int)convertTodecimal / 1;
	System.out.println("Number of boxes of pizza to buy = " + numberOfBoxes + " boxes");

	int leftOver = (divisor * numberOfBoxes) - buyerGuest;
	System.out.println("Number left over after slices after serving = " + leftOver + " slices");

	int totalPrice = price * numberOfBoxes;
	System.out.print("Price = " + totalPrice);



}


}