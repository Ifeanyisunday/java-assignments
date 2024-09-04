public class HugeInteger {

    private int[] elements;
    private  int bitSize = 9;
    private final int baseCount = 1000000000;

    public HugeInteger (String letters){
        if(letters.length() > 9) {
            int bits = (letters.length() + bitSize) / bitSize;
            elements = new int[bits];
            int count = 0;
            int counter = 0;
            for(int i = 0; i < elements.length; i++){
                String stringValue = "";
                for(int j = count; j < counter; j++) {
                    stringValue += letters.charAt(i);
                }
                int convertString = Integer.parseInt(stringValue);
                elements[i] = convertString;
                count+= 9;
                counter+= 9;
            }
        }else{
            elements = new int[1];
            String stringValue = "";
            for(int i = 0; i < elements.length; i++) {
                for (int j = 0; j < letters.length(); j++) {
                    stringValue += letters.charAt(i);
                }
                int convertString = Integer.parseInt(stringValue);
                elements[0] = convertString;
            }
        }
    }


//    public HugeInteger add(HugeInteger number){
//        int maxArr = Math.max(this.elements.length, number.elements.length);
//
//    }

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



    public static void main(String[] args){
        HugeInteger s = new HugeInteger("12345678");

        System.out.print(s.convertArrayToString(s.getElements()));
    }
}