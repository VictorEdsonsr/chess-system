package boardGame;

public class Board {
    private int boardRows;
    private int boardColumns;
    private Piece[][] pieces;

    public Board(int boardRows, int boardColumns) {
        this.boardRows = boardRows;
        this.boardColumns = boardColumns;
        pieces = new Piece[boardRows][boardColumns];
    }

    public int getBoardRows() {
        return boardRows;
    }

    public void setBoardRows(int boardRows) {
        this.boardRows = boardRows;
    }

    public int getBoardColumns() {
        return boardColumns;
    }

    public void setBoardColumns(int boardColumns) {
        this.boardColumns = boardColumns;
    }
}
