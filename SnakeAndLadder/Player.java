package SnakeAndLadder;

public class Player {
    String playerName;
    int playerAge;
    int playerId;
    int playerColor;
    int position;

    public Player(String playerName, int playerAge, int playerId, int playerColor) {
        this.playerName = playerName;
        this.playerAge = playerAge;
        this.playerId = playerId;
        this.playerColor = playerColor;
        this.position = 0;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerAge() {
        return playerAge;
    }

    public void setPlayerAge(int playerAge) {
        this.playerAge = playerAge;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public int getPlayerColor() {
        return playerColor;
    }

    public void setPlayerColor(int playerColor) {
        this.playerColor = playerColor;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }


    

}
