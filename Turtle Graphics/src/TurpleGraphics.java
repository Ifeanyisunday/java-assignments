public class TurpleGraphics {
    private boolean penUp = true;
    private Direction point = Direction.EAST;
    private Position position = new Position(0, 0);;

    public boolean getCurrentState() {
        return penUp;
    }

    public void penDown(){
         penUp = false;
    }

    public Direction getCurrentDirection() {
        return point;
    }

    public void turnDirectionRight() {
        if(getCurrentDirection() == Direction.WEST) point = Direction.NORTH;
        if(getCurrentDirection() == Direction.SOUTH) point = Direction.WEST;
        if(getCurrentDirection() == Direction.EAST) point = Direction.SOUTH;
    }

    public void turnDirectionLeft() {
        if(getCurrentDirection() == Direction.WEST) point = Direction.SOUTH;
        if(getCurrentDirection() == Direction.NORTH) point = Direction.WEST;
        if(getCurrentDirection() == Direction.EAST) point = Direction.NORTH;
    }

    public Position getCurrentPosition(){
        position = new Position(position.getRow(), position.getCol());
        return position;
    }


    public String moveFoward(int number) {
        if(getCurrentDirection() == Direction.EAST) {position.setCol(number - 1); position = new Position(position.getRow(), position.getCol());}
        else if(getCurrentDirection() == Direction.SOUTH){ position.setRow(number - 1); position = new Position(position.getRow(), position.getCol());}
        else if(getCurrentDirection() == Direction.WEST) {position.setCol(-(number)); position = new Position(position.getRow(), position.getCol());}
        else if(getCurrentDirection() == Direction.NORTH) {position.setRow(-(number)); position = new Position(position.getRow(), position.getCol());}
        return position.toString();
    }
}
