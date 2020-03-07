package cn.xpbootcamp.tennis.score;

import cn.xpbootcamp.tennis.Player;

public class TiedScore extends AbstractScore {

    public TiedScore(Player player1, Player player2) {
        super(player1, player2);
    }

    @Override
    public boolean isApplied() {
        return player1.isScoreEqualsWith(player2);
    }

    public String state() {
        return player1.getScore() > 2 ? "Deuce" : getScoreName(player1.getScore()) + "-All";
    }

}
