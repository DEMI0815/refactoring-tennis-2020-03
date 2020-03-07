package cn.xpbootcamp.tennis;

public class AdvantageScore extends AbstractScore{

    public AdvantageScore(Player player1, Player player2) {
        super(player1, player2);
    }

    public String state() {
        return "Advantage " + (player1.doesAdvantage(player2) ? player1.getName() : player2.getName());
    }
}
