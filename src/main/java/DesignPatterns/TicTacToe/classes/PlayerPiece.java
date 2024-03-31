package DesignPatterns.TicTacToe.classes;

public abstract class PlayerPiece {
    String name;
    PieceType pieceType;
    public PlayerPiece(PieceType pieceType, String name) {
        this.pieceType = pieceType;
        this.name = name;
    }
}
