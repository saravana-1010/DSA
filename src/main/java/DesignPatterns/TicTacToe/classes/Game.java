package DesignPatterns.TicTacToe.classes;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

public class Game {
    Deque<PlayerPiece> playerPieceList;
    Board board;
    public Game() {
        initializeBoard();
    }

    public void initializeBoard() {
        playerPieceList = new ArrayDeque<>();
        PlayerPiece playerPieceX = new PlayerPieceX(PieceType.X, "Player1");
        PlayerPiece playerPieceO = new PiecePlayerO(PieceType.O, "Player2");
        board = new Board(3);
        playerPieceList.add(playerPieceX);
        playerPieceList.add(playerPieceO);
    }

    public String startGame() {
        while(true) {
            board.printBoard();
            PlayerPiece playerPiece = playerPieceList.removeFirst();
            if(!findSpace(board)) {
                break;
            }
            System.out.println(playerPiece.name + "'s turn, Enter row and column: ");
            Scanner sc = new Scanner(System.in);
            String[] strings = sc.nextLine().split(",");
            int row = Integer.parseInt(strings[0]);
            int col = Integer.parseInt(strings[1]);
            boolean possible = board.placePiece(board, row, col, playerPiece);
            if(!possible) {
                playerPieceList.addFirst(playerPiece);
                System.out.println("Already filled, enter again!");
                continue;
            }
            boolean winner = isThereAnyWinner(board.playerPiece);
            if(winner) {
                return playerPiece.name;
            }
            playerPieceList.addLast(playerPiece);
        }
        return "tie";
    }

    public boolean findSpace(Board board) {
        PlayerPiece[][] boardArray = board.playerPiece;
        for(int i=0; i<boardArray.length; i++) {
            for(int j=0; j<boardArray[0].length; j++) {
                if(boardArray[i][j] == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isThereAnyWinner(PlayerPiece[][] boardArray) {
        boolean rowMatch = true;
        boolean colMatch = true;
        boolean diagMatch = true;
        boolean antiDiagMatch = true;

        for(int i=0; i<boardArray.length; i++) {
            PlayerPiece playerPiece = boardArray[i][0];
            for(int j=1; j<boardArray[0].length; j++) {
                if(boardArray[i][j] == null || boardArray[i][j] != playerPiece) {
                    rowMatch = false;
                    break;
                }
            }
        }

        for(int j=0; j<boardArray[0].length; j++) {
            PlayerPiece playerPiece = boardArray[0][j];
            for(int i=1; i<boardArray.length; i++) {
                if(boardArray[i][j] == null || boardArray[i][j] != playerPiece) {
                    colMatch = false;
                    break;
                }
            }
        }

        for(int i=0, j=0; i<boardArray.length; i++, j++) {
            PlayerPiece playerPiece = boardArray[i][j];
            if(boardArray[i][j] == null || boardArray[i][j] != playerPiece) {
                diagMatch = false;
                break;
            }
        }

        for(int i=0, j=boardArray[0].length-1; i<boardArray.length; i++, j--) {
            PlayerPiece playerPiece = boardArray[i][j];
            if(boardArray[i][j] == null || boardArray[i][j] != playerPiece) {
                antiDiagMatch = false;
                break;
            }
        }

        return rowMatch || colMatch || diagMatch || antiDiagMatch;
    }
}
