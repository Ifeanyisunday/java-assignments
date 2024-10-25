import java.util.Arrays;
import java.util.Scanner;

public class ArrayTaskTwo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int scoreLength = 10;

        int[] arrNumbers = new int[10];
        System.out.println("Enter score");
        for(int count = 0; count < scoreLength; count++){
            int score = input.nextInt();
            arrNumbers[count] = score;
        }

        System.out.println("Horizontal");
        System.out.println(Arrays.toString(arrNumbers));
        }
}
