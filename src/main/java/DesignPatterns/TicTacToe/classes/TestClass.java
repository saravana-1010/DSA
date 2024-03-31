package DesignPatterns.TicTacToe.classes;

public class TestClass {
    public static void main(String[] args) {
        Game game = new Game();
        String s = game.startGame();
        System.out.println("Final board state:");
        game.board.printBoard();
        System.out.println("Result: " + s);
    }
}
