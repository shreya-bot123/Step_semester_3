package week1.practice_problems;

import java.util.Random;

public class RockPaperScissorsGame {
    static String playRound(String playerMove, String computerMove) {
        if (playerMove.equalsIgnoreCase(computerMove)) return "Draw";

        if ((playerMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Scissors")) ||
            (playerMove.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Rock")) ||
            (playerMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Paper"))) {
            return "Player Wins";
        }
        return "Computer Wins";
    }

    public static void main(String[] args) {
        String[] playerMoves = {"Rock", "Paper", "Scissors", "Rock", "Paper"};
        String[] moves = {"Rock", "Paper", "Scissors"};
        Random random = new Random(1);

        int wins = 0, losses = 0, draws = 0;

        for (int i = 0; i < playerMoves.length; i++) {
            String computerMove = moves[random.nextInt(3)];
            String result = playRound(playerMoves[i], computerMove);

            System.out.println("Round " + (i + 1) + " | Player: " + playerMoves[i]
                    + " | Computer: " + computerMove + " | " + result);

            if (result.equals("Player Wins")) wins++;
            else if (result.equals("Computer Wins")) losses++;
            else draws++;
        }

        double winPercentage = wins * 100.0 / playerMoves.length;
        System.out.println("Wins: " + wins + " / Losses: " + losses
                + " / Draws: " + draws + " / Win % = " + winPercentage + "%");
    }
}
