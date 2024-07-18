public class Position {
    private int row;
    private int column;

    Position(int row, int column){
        this.row = row;
        this.column = column;
    }

    @Override
    public String toString(){
        return "{ " + new Position(0,0) + "}";
    }



}
