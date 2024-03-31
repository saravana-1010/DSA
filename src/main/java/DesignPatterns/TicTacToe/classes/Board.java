package DesignPatterns.TicTacToe.classes;

public class Board {
    int n;
    PlayerPiece[][] playerPiece;
    public Board(int n) {
        this.n = n;
        this.playerPiece = new PlayerPiece[n][n];
    }
    public boolean placePiece(Board board, int row, int col, PlayerPiece playerPiece) {
        if(board.playerPiece[row][col] == null) {
            board.playerPiece[row][col] = playerPiece;
            return true;
        }
        return false;
    }
    public void printBoard() {
        for(int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print((playerPiece[i][j]==null ? " " : playerPiece[i][j].pieceType) + "| ");
            }
            System.out.println();
            System.out.println("-- -- --");
        }
    }
}
