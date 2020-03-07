package cn.xpbootcamp.tennis;

public class RegularScore extends AbstractScore {

    public RegularScore(Player player1, Player player2) {
        super(player1, player2);
    }

    @Override
    public boolean isApplied() {
        return true;
    }

    public String state() {
        return getScoreName(player1.getScore()) + "-" + getScoreName(player2.getScore());
    }

}
