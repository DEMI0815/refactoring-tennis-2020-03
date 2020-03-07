package cn.xpbootcamp.tennis;

import java.util.Arrays;

public abstract class AbstractScore {
    Player player1;
    Player player2;

    public AbstractScore(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public abstract boolean isApplied();

    public abstract String state();

    static String getScoreName(int score) {
        return Arrays.asList("Love", "Fifteen", "Thirty", "Forty").get(score);
    }
}
