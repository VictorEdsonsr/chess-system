package chess;

import boardGame.Board;

public class ChessMatch {
    private Board board;

    public ChessMatch() {
        board = new Board(8,8);
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] matriz = new ChessPiece[board.getBoardRows()][board.getBoardColumns()];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (ChessPiece) board.piece(i,j) ;
            }
        }
        return matriz;
    }
}
