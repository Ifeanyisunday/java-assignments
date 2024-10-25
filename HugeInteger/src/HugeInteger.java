public class HugeInteger {

    private int[] elements;
    private  int bitSize = 9;
    private final int baseCount = 1000000000;

    public HugeInteger (String letters){
        workOnString(letters);
    }

    public String parse(String letters){
        workOnString(letters);
        return convertArrayToString(elements);
    }



    public int[] getElements() {
        return elements;
    }

    public String convertArrayToString(int[] digit){
        String string = "";
        for(int i = 0; i < elements.length; i++){
            string += String.valueOf(elements[i]);
        }
        return string;
    }


    public HugeInteger add(HugeInteger number) {
        int maxLength = Math.max(this.elements.length, number.elements.length);
        int[] result = new int[maxLength + 1]; // +1 for possible carry overflow

        int carry = 0;
        for (int i = 0; i < maxLength; i++) {
            int thisChunk = (i < this.elements.length) ? this.elements[i] : 0;
            int otherChunk = (i < number.elements.length) ? number.elements[i] : 0;

            int sum = thisChunk + otherChunk + carry;
            carry = sum / bitSize;
            result[i] = sum % bitSize;
        }

        // If there's still a carry left, put it in the most significant chunk
        if (carry > 0) {
            result[maxLength] = carry;
        }

        // Convert result to a string and return a new SimpleBigInteger
        return new HugeInteger(convertArrayToString(result));
    }


    public void workOnString(String letters){
        if(letters.length() > 9) {
            int bits = (letters.length() + bitSize) / bitSize;
            elements = new int[bits];
            int count = 0;
            int counter = 9;
            for(int i = 0; i < elements.length; i++){
                String stringValue = "";
                for(int j = count; j < counter; j++) {
                    if(j == letters.length()){
                        break;
                    }else {
                        stringValue += letters.charAt(j);
                    }
                }
                int convertString = Integer.parseInt(stringValue);
                elements[i] = convertString;
                count+= 9;
                counter+= 9;
            }
        }else{
            elements = new int[1];
            int convertString = Integer.parseInt(letters);
            elements[0] = convertString;
        }
    }

    public static void main(String[] args){
        String s = "123456678890826242436479797725253722612";
        HugeInteger hugeInteger = new HugeInteger(s);
        System.out.print(hugeInteger.convertArrayToString(hugeInteger.elements));
    }
}