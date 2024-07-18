import java.util.Scanner;

public class NaturalNumber{
public static void main(String... args){
Scanner input = new Scanner(System.in);

int sum = 0;
int counter = 1;

while(counter <= 10){
counter++;
System.out.println("Enter natural number: ");
int userInput = input.nextInt();
sum += userInput; 

}
System.out.println("The sum of all natural numbers is = " + sum);	
	




}





}