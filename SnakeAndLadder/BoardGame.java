package SnakeAndLadder;

import java.util.*;

public class BoardGame {
    int size;
    List<Elements> board;
    int turn;
    List<Player> players;
    Dice dice;
    int playersCount;

    public BoardGame(int size, List<Player> players) {
        this.size = size;
        this.players = players;
        this.playersCount = players.size();
        this.board = new ArrayList<>(size);
        this.turn = 0;
        this.dice = new Dice();
    }

    void initializeBoard() {
        for(int i=0; i<size; i++) {
            int value = (int) (Math.random() * 3);
            if (value == 0) {
                int val = (int) (Math.random() * 10) + 1;
                int finalPos = Math.min(size - 1, i + val);
                board.add(new Ladder(i, finalPos - i, ElementType.LADDER));
            } else if (value == 1) {
                int val = (int) (Math.random() * 10) + 1;
                int finalPos = Math.max(0, i - val);
                board.add(new Snake(i, finalPos - i, ElementType.SNAKE));
            } else {
                board.add(new Empty(i, 0, ElementType.NONE));
            }
        }
    }
    
    public void startGame() {
        Boolean winner = false;
        while(!winner) {
            Player currentPlayer = players.get(turn);
            int diceValue = dice.rollDice();
            int newPosition = currentPlayer.position + diceValue;
            if(newPosition < size - 1) {
                if(board.get(newPosition).elementType == ElementType.SNAKE) {
                    newPosition = newPosition + board.get(newPosition).jump;
                } else if(board.get(newPosition).elementType == ElementType.LADDER) {
                    newPosition = newPosition + board.get(newPosition).jump;
                }
            }

            if(newPosition >= size - 1) {
                currentPlayer.position = size - 1;
                winner = true;
                System.out.println("Player " + currentPlayer.playerName + " wins the game");
            } else {
                currentPlayer.position = newPosition;
                System.out.println("Player " + currentPlayer.playerName + " moved to position " + currentPlayer.position);
                turn = (turn + 1) % playersCount;
            }
        }
    }
}
