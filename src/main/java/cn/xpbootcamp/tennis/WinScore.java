package cn.xpbootcamp.tennis;

public class WinScore extends AbstractScore {


    public WinScore(Player player1, Player player2) {
        super(player1, player2);
    }

    public String state() {
        return "Win for " + (player1.doesWin(player2) ? player1.getName() : player2.getName());
    }
}
