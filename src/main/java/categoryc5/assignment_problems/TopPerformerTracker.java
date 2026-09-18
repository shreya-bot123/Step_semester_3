package categoryc5.assignment_problems;

public class TopPerformerTracker {
    public static String findMinMaxSpread(int[] scores) {
        int min = scores[0], max = scores[0];
        for (int score : scores) {
            if (score < min) min = score;
            if (score > max) max = score;
        }
        return "Min: " + min + " | Max: " + max + " | Spread: " + (max - min);
    }
}