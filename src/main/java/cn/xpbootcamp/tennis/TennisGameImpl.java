
package cn.xpbootcamp.tennis;

import java.util.Arrays;

public class TennisGameImpl implements TennisGame {

    private Player player1;
    private Player player2;

    public TennisGameImpl(String player1Name, String player2Name) {
        this.player1 = new Player(player1Name);
        this.player2 = new Player(player2Name);
    }

    public void wonPoint(String playerName) {
        if (player1.getName().equals(playerName)) {
            player1.wonPoint();
        } else {
            player2.wonPoint();
        }
    }

    public String getScore() {
        if (player1.isScoreEqualsWith(player2)) {
            return scoreForEquals();
        }
        if (player1.doesAdvantage(player2)) {
            return scoreForAdvantage(player1);
        }
        if (player2.doesAdvantage(player1)) {
            return scoreForAdvantage(player2);
        }
        if (player1.doesWin(player2)) {
            return scoreForWin(player1);
        }
        if (player2.doesWin(player1)) {
            return scoreForWin(player2);
        }
        return scoreForBothBelow4();
    }

    private String scoreForBothBelow4() {
        return getScoreName(player1.getScore()) + "-" + getScoreName(player2.getScore());
    }

    private String scoreForWin(Player player) {
        return "Win for " + player.getName();
    }

    private String scoreForAdvantage(Player player) {
        return "Advantage " + player.getName();
    }

    private String scoreForEquals() {
        return player1.getScore() > 2 ? "Deuce" : getScoreName(player1.getScore()) + "-All";
    }

    private String getScoreName(int score) {
        return Arrays.asList("Love", "Fifteen", "Thirty", "Forty").get(score);
    }
}