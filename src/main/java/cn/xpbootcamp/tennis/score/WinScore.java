package cn.xpbootcamp.tennis.score;

import cn.xpbootcamp.tennis.Player;

public class WinScore extends AbstractScore {


    public WinScore(Player player1, Player player2) {
        super(player1, player2);
    }

    @Override
    public boolean isApplied() {
        return player1.doesWin(player2) || player2.doesWin(player1);
    }

    public String state() {
        return "Win for " + (player1.doesWin(player2) ? player1.getName() : player2.getName());
    }
}
