public class PatternD {
	public static void main(String... args){
	System.out.println("");
	System.out.println("Pattern D\n");

	int asterisk = 6;

	for(int count = 1; count <= asterisk; count++){
		for(int counter = 1; counter <= asterisk; counter++){
			asterisk--;
			System.out.print("");
			System.out.print(counter);
	        }
		
		System.out.println("");
	}


}
}