public class PatternC {
	public static void main(String... args){
	System.out.println("");
	System.out.println("Pattern C\n");

	int asterisk = 6;
	int index = 1;

	for(int count = asterisk; count >= index; ){
		for(int counter = count; counter >= index; counter--){
			System.out.print(counter);
	        }
		
		System.out.println("");
	}


}
}