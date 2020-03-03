package cn.xpbootcamp.tennis;

public class TennisGame2 implements TennisGame {
    public int player1Score = 0;
    public int player2Score = 0;

    public String player1Result = "";
    public String player2Result = "";

    public String getScore() {
        String score = "";
        if (player1Score == player2Score) {
            score = getScoreWhenEqual(player1Score);
        }

        if (player1Score > 0 && player2Score == 0) {
            player1Result = getScore(player1Score);
            player2Result = "Love";
            score = player1Result + "-" + player2Result;
        }
        if (player2Score > 0 && player1Score == 0) {
            player2Result = getScore(player2Score);
            player1Result = "Love";
            score = player1Result + "-" + player2Result;
        }

        if (player1Score > player2Score && player1Score < 4) {
            player1Result = getScore(player1Score);
            player2Result = getScore(player2Score);
            score = player1Result + "-" + player2Result;
        }
        if (player2Score > player1Score && player2Score < 4) {
            player2Result = getScore(player2Score);
            player1Result = getScore(player1Score);
            score = player1Result + "-" + player2Result;
        }

        if (player1Score > player2Score && player2Score >= 3) {
            score = "Advantage player1";
        }

        if (player2Score > player1Score && player1Score >= 3) {
            score = "Advantage player2";
        }

        if (player1Score >= 4 && player2Score >= 0 && (player1Score - player2Score) >= 2) {
            score = "Win for player1";
        }
        if (player2Score >= 4 && player1Score >= 0 && (player2Score - player1Score) >= 2) {
            score = "Win for player2";
        }
        return score;
    }

    private String getScore(int score) {
        String result = "";
        if (score == 0)
            result = "Love";
        if (score == 1)
            result = "Fifteen";
        if (score == 2)
            result = "Thirty";
        if (score == 3)
            result = "Forty";

        return result;
    }

    private String getScoreWhenEqual(int score) {
        String result;
        if (score < 3) {
            result = getScore(score);
            result += "-All";
            return result;
        } else {
            return "Deuce";
        }
    }

    public void P1Score() {
        player1Score++;
    }

    public void P2Score() {
        player2Score++;
    }

    public void wonPoint(String player) {
        if (player.equals("player1"))
            P1Score();
        else
            P2Score();
    }
}