import java.util.Scanner;

public class Logistics{

	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter rider's successful delivery: ");
	
	int delivery = input.nextInt();
	
	int result = rider(delivery);

	System.out.println("your wage is " + result);



	}




	public static int rider(int delivery){
	int wage = 0;
	if(delivery < 50){
		wage = delivery * 160 + 5000;
	}else if(delivery > 50 && delivery < 59){
		wage = delivery * 200 + 5000;
	}else if(delivery > 60 && delivery < 69){
		wage = delivery * 250 + 5000;
	}else if(delivery >= 70){
		wage = delivery * 500 + 5000;
	}
	
	return wage;

	}





}