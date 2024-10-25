import java.util.Arrays;

public class ArrayTaskSix {

    public static int sum(int[] numbers){
        int[] newArr = new int[numbers.length / 2];

        int sum = 0;

        int counter = 0;
        for(int count = 0; count < numbers.length; count++){
            if(count % 2 == 0) {
                newArr[counter] = numbers[count];
                counter++;
            }
        }

        for(int i = 0; i < newArr.length; i++){
            sum += newArr[i];
        }

        return  sum;
    }

    public static void main (String[] args){
        int[] numbers = {1,2,3,4};
        System.out.print(ArrayTaskSix.sum(numbers));

    }
}
