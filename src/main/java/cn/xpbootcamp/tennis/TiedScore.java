package cn.xpbootcamp.tennis;

import java.util.Arrays;

public class TiedScore extends AbstractScore {

    public TiedScore(Player player1, Player player2) {
        super(player1, player2);
    }

    public String state() {
        return player1.getScore() > 2 ? "Deuce" : getScoreName(player1.getScore()) + "-All";
    }

}
