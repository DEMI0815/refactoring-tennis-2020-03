package cn.xpbootcamp.tennis;

public class TennisGame1 implements TennisGame {

    private int player1Score = 0;
    private int player2Score = 0;

    public void wonPoint(String playerName) {
        if (playerName.equals("player1"))
            player1Score += 1;
        else
            player2Score += 1;
    }

    public String getScore() {
        String score;
        if (player1Score == player2Score) {
            score = getEqualsScoreNew(player1Score);
        } else if (player1Score >= 4 || player2Score >= 4) {
            score = getAdvantageAndWin();
        } else {
            score = getScoreOne(player1Score) + "-" + getScoreOne(player2Score);
        }
        return score;
    }

    private String getScoreOne(int score) {
        if (score == 3) {
            return "Forty";
        }

        return getScoreIntermediate(score);
    }

    private String getScoreIntermediate(int score) {
        String result;
        switch (score) {
            case 0:
                result = "Love";
                break;
            case 1:
                result = "Fifteen";
                break;
            case 2:
                result = "Thirty";
                break;
            default:
                result = "Deuce";
        }
        return result;
    }

    private String getEqualsScoreNew(int score) {
        String result = getScoreIntermediate(score);
        if (score < 3) {
            result += "-All";
        }
        return result;
    }

    private String getAdvantageAndWin() {
        String score;
        int minusResult = player1Score - player2Score;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }

}