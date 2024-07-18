import java.util.Arrays;

public class Function {

        public String displayTrueOrFalse(int[] numbers) {
            boolean[] newArr = new boolean[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) {
                    newArr[i] = false;
                } else {
                    newArr[i] = true;
                }
            }

            System.out.println(Arrays.toString(newArr));
            return Arrays.toString(newArr);
        }
    }
