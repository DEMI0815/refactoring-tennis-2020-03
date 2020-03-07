package cn.xpbootcamp.tennis;

public class Player {
    String name;
    int score;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void wonPoint() {
        score++;
    }

    public boolean isScoreEqualsWith(Player player) {
        return score == player.score;
    }

    public boolean doesAdvantage(Player player) {
        return score >= 4 && score - player.score == 1;
    }

    public boolean doesWin(Player player) {
        return score >= 4 && score - player.score >= 1;
    }
}
