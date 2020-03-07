package cn.xpbootcamp.tennis;

import java.util.Arrays;

public class RegularScore extends AbstractScore {

    public RegularScore(Player player1, Player player2) {
        super(player1, player2);
    }

    public String state() {
        return getScoreName(player1.getScore()) + "-" + getScoreName(player2.getScore());
    }

}
