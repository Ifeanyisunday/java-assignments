public class Board {

    private int[][] board = new int[3][3];

    public void displayBoard() {
        System.out.println("| - | - | - |");
        System.out.println("| 1 | 2 | 3 |");
        System.out.println("| - | - | - |");
        System.out.println("| 4 | 5 | 6 |");
        System.out.println("| - | - | - |");
        System.out.println("| 7 | 8 | 9 |");
        System.out.println("| - | - | - |");
    }

    public void displayBoardState(){
        System.out.println("| - | - | - |");
        System.out.println(printRow(0));
        System.out.println("| - | - | - |");
        System.out.println(printRow(1));
        System.out.println("| - | - | - |");
        System.out.println(printRow(2));
        System.out.println("| - | - | - |");
    }

    private String printRow(int row) {
        StringBuilder displayRow = new StringBuilder("| ");
        for(int i = 0; i < 3; i++){
            if(board[row][i] == 0) displayRow.append(" ");
            if(board[row][i] == 0) displayRow.append("X");
            if(board[row][i] == 0) displayRow.append("O");
            displayRow.append(" | ");
        }
        displayRow.deleteCharAt(displayRow.lastIndexOf(" "));
        return displayRow.toString();
    }
}
