package cn.xpbootcamp.tennis;

public class WinScore {
    private Player player;

    public WinScore(Player player) {
        this.player = player;
    }

    public String state() {
        return "Win for " + player.getName();
    }
}
