package categoryc5.assignment_problems;

import java.util.Arrays;

public class FantasyLeagueAutoDraftRankingEngine {
    public static class Player implements Comparable<Player> {
        private String name;
        private int matchesPlayed;
        private double battingAverage;
        private boolean injured;

        public Player(String name, int matchesPlayed, double battingAverage, boolean injured) {
            this.name = name;
            this.matchesPlayed = matchesPlayed;
            this.battingAverage = battingAverage;
            this.injured = injured;
        }

        public String getName() { return name; }
        public int getMatchesPlayed() { return matchesPlayed; }
        public double getBattingAverage() { return battingAverage; }
        public boolean isInjured() { return injured; }

        public static boolean isDraftable(int matchesPlayed, double battingAverage, boolean injured) {
            return matchesPlayed >= 10 || (battingAverage >= 40 && !injured);
        }

        public static boolean isDraftable(int matchesPlayed, boolean injured) {
            return matchesPlayed >= 10;
        }

        @Override
        public int compareTo(Player other) {
            return Double.compare(other.battingAverage, this.battingAverage);
        }
    }

    public static String draftAndRank(Player[] players) {
        Player[] draftable = Arrays.stream(players)
                .filter(p -> Player.isDraftable(p.matchesPlayed, p.battingAverage, p.injured))
                .toArray(Player[]::new);

        Arrays.sort(draftable);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < draftable.length; i++) {
            if (i > 0) result.append(" | ");
            result.append(i + 1).append(". ").append(draftable[i].name);
        }
        return result.toString();
    }
}
