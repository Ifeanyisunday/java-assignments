public class PatternD {
	public static void main(String... args){
	System.out.println("");
	System.out.println("Pattern D\n");

	int asterisk = 7;

	for(int count = 1; count < asterisk; count++){
		for(int counter = 1; counter <= count; counter++){
			System.out.print(" ");

	        }
		
		for(int row = 1; row <= asterisk-count; row++){
			System.out.printf("%d", row);

	        }
		
		
		System.out.println("");
		}


}



}