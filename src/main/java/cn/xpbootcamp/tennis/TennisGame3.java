package cn.xpbootcamp.tennis;

public class TennisGame3 implements TennisGame {

    private int player1Score;
    private int player2Score;
    private String player1Name;
    private String player2Name;

    public TennisGame3(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore() {
        String s;
        if (player2Score < 4 && player1Score < 4 && !(player2Score + player1Score == 6)) {
            String[] p = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
            s = p[player2Score];
            return (player2Score == player1Score) ? s + "-All" : s + "-" + p[player1Score];
        } else {
            if (player2Score == player1Score)
                return "Deuce";
            s = player2Score > player1Score ? player1Name : player2Name;
            return ((player2Score - player1Score)*(player2Score - player1Score) == 1) ? "Advantage " + s : "Win for " + s;
        }
    }

    public void wonPoint(String playerName) {
        if (playerName.equals("player1"))
            this.player2Score += 1;
        else
            this.player1Score += 1;

    }

}