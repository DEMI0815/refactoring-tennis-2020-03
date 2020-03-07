
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
        if (isScoreEquals()) {
            return scoreForEquals();
        }
        if (isAtLeastOneMoreThan4()) {
            return scoreForAtLeastOneMoreThan4();
        }
        return scoreForBothBelow4();
    }

    private String scoreForAtLeastOneMoreThan4() {
        if (doesPlayer1HasAdvantage()) {
            return scoreForAdvantage(player1);
        }
        if (doesPlayer2HasAdvantage()) {
            return scoreForAdvantage(player2);
        }
        if (doesPlayer1Win()) {
            return scoreForWin(player1);
        }
        if (doesPlayer2Win()) {
            return scoreForWin(player2);
        }
        return "";
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

    private boolean doesPlayer1Win() {
        return player1.getScore() - player2.getScore() >= 2;
    }

    private boolean doesPlayer2Win() {
        return player2.getScore() - player1.getScore() >= 2;
    }

    private boolean doesPlayer2HasAdvantage() {
        return player1.getScore() - player2.getScore() == -1;
    }

    private boolean doesPlayer1HasAdvantage() {
        return player1.getScore() - player2.getScore() == 1;
    }

    private boolean isAtLeastOneMoreThan4() {
        return player1.getScore() >= 4 || player2.getScore() >= 4;
    }

    private String scoreForEquals() {
        String score;
        score = player1.getScore() > 2 ? "Deuce" : getScoreName(player1.getScore()) + "-All";
        return score;
    }

    private boolean isScoreEquals() {
        return player1.getScore() == player2.getScore();
    }

    private String getScoreName(int score) {
        return Arrays.asList("Love", "Fifteen", "Thirty", "Forty").get(score);
    }
}