public class MyOwnArrayList implements PersonalList{
    private String[] dataBase;
    private int arrayCurrentLength = 5;
    private int sizeCount;
    boolean dataStatus;


    public MyOwnArrayList(){
        dataBase = new String[arrayCurrentLength];
    }

    public int increaseArrayLength(){
        if(sizeCount == arrayCurrentLength){
            arrayCurrentLength = arrayCurrentLength * 2;
        }
        return arrayCurrentLength;
    }


    @Override
    public int size() {
        return sizeCount;
    }

    @Override
    public boolean isEmpty() {
        if(sizeCount == 0){dataStatus = true;}
        return dataStatus;
    }

    @Override
    public void remove(int index) {
        int count = 0;
        for(int i = index; i < size() - 1; i++){
                dataBase[i] = dataBase[i + 1];
        }
        sizeCount--;
    }

    @Override
    public void remove(String index) {

    }

    @Override
    public void clear() {
         sizeCount = sizeCount - size();
    }

    @Override
    public String get(int index) {
        String element = "";
        for(int i = 0; i < dataBase.length; i++){
            if(i == index){
                element = dataBase[i];
            }
        }
        return element;
    }

    @Override
    public void add(String element) {
        increaseArrayLength();
        dataBase[sizeCount] = element;
        sizeCount++;
    }

    public boolean contains(String index){

        return false;
    }

    public int capacity(){
        return 0;
    }
}
