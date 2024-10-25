
public class StringArray {

    private boolean isTrue;

    public boolean checkAlphabet(String alpha){
        int index = 0;
        String newLetter;
        String [] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        for(int count = 0; count < alpha.length(); count++){
            char character = alpha.charAt(count);
            newLetter = String.valueOf(character);
            for(int counter = 0; counter < letters.length; counter++){
                if(newLetter.equalsIgnoreCase(letters[counter])){
                    index+= 1;
                }
            }
        }

        if(index == alpha.length()){
            this.isTrue = true;
        }

        return isTrue;
    }

    public boolean checkAlphabet1(String alpha){
        int index1 = 0;
//        String newLetter;
        String [] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        for(int count = 0; count < letters.length; count++){
//            char character = alpha.charAt(count);
//            newLetter = String.valueOf(character);
            for(int counter = 0; counter < alpha.length(); counter++){
                if(letters[count].equalsIgnoreCase(String.valueOf(alpha.charAt(counter)))){
                    index1+= 1;
                }
            }
        }

        if(index1 == alpha.length()){
            this.isTrue = true;
        }

        return isTrue;
    }



    public static void main(String[] args){
        StringArray name = new StringArray();
        String name1 = "hello";
        System.out.print(name.checkAlphabet1(name1));
    }
}
