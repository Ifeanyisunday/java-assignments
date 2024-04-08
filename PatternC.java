public class PatternC {
	public static void main(String... args){
	System.out.println("");
	System.out.println("Pattern C\n");

	int asterisk = 6;

	for(int count = 1; count <= asterisk; count++){
		for(int counter = 1; counter >= count; counter++){
			System.out.print(" ");

	        }
		
		for(int row = 6; row >= asterisk-count; row--){
			System.out.print(row);

	        }
		
		
		System.out.println("");
		}


}



}