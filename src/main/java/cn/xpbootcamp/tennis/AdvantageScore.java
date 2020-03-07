package cn.xpbootcamp.tennis;

public class AdvantageScore {
    private Player player;

    public AdvantageScore(Player player) {
        this.player = player;
    }

    public String state() {
        return "Advantage " + player.getName();
    }
}
