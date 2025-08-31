package SnakeAndLadder;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BoardGame game = new BoardGame(100, createPlayers());
        game.initializeBoard();
        game.startGame();
    } 


    public static List<Player> createPlayers() {
        List<Player> players = new ArrayList<>();
        Player p1 = new Player("aman", 27, 22, 1);
        Player p2 = new Player("goel", 25, 20, 2);

        players.add(p1);
        players.add(p2);

        return players;
    }
}
