import java.util.Arrays;

public class ArrayTaskFour {

    public static String output(int[] numbers){
        int[] newArr = new int[numbers.length / 2];

        int counter = 0;
        for(int count = 0; count < numbers.length; count++){
            if(count % 2 == 0) {
                newArr[counter] = numbers[count];
                counter++;
            }
        }
        return Arrays.toString(newArr);
    }


    public static void main (String[] args){
        int[] numbers = {1,2,3,4};
        System.out.print(ArrayTaskFour.output(numbers));

    }
}
