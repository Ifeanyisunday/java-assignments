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


//    public HugeInteger add(HugeInteger number){
//        int highestElement = Math.max(this.elements.length, number.elements.length);
//
//        for(int i = 0; i < highestElement; i++){
//            if
//        }
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