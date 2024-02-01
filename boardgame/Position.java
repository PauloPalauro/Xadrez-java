package boardgame;

public class Position {
    
    private int row;
    private int columns;

    public Position(){
    }

    public Position(int row, int columns){
        this.row = row;
        this.columns = columns;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return columns;
    }

    public void setColumn(int columns) {
        this.columns = columns;
    }

    public void setPosition(int row, int columns){

    }

    @Override
    public String toString(){
        return row + ", " + columns;
    }
}
