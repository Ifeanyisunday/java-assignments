import java.util.Scanner;

public class PatternA {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.printf("Pattern A\n");
	System.out.println();

	int asterisks = 6;

	for(int count = 1; count <= asterisks; count++){
		for( int counter = 1; counter <= count; counter++){
			System.out.printf("%2d", counter);
				
		}
	System.out.println();
	}


}
}