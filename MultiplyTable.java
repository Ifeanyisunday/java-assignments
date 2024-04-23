public class MultiplyTable{
	public static void main(String... args){

int multiplier = 1;	
	for(int i = 1; i <= 12; i++){
		for(int j = 1; j <= 12; j++){
			multiplier = j * i;
			System.out.printf("%d%s%d%s%d\t", j," x ",i," = ",multiplier);
		}
		System.out.println("");

	}


	}

}