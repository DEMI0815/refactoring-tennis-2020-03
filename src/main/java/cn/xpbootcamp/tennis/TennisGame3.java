package cn.xpbootcamp.tennis;

public class TennisGame3 implements TennisGame {

    private int player1Score;
    private int player2Score;
    private String player1Name;
    private String player2Name;

    private static final String[] score = new String[]{"Love", "Fifteen", "Thirty", "Forty"};

    public TennisGame3(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore() {
        if (player2Score < 4 && player1Score < 4 && !isTotalSix()) {
            return (player2Score == player1Score) ? score[player2Score] + "-All" : score[player2Score] + "-" + score[player1Score];
        } else {
            if (player2Score == player1Score)
                return "Deuce";
            String name = player2Score > player1Score ? player1Name : player2Name;
            return isAdvantage() ? "Advantage " + name : "Win for " + name;
        }
    }

    private boolean isAdvantage() {
        return (player2Score - player1Score) * (player2Score - player1Score) == 1;
    }

    private boolean isTotalSix() {
        return player2Score + player1Score == 6;
    }

    public void wonPoint(String playerName) {
        if (playerName.equals("player1"))
            this.player2Score += 1;
        else
            this.player1Score += 1;

    }

}