package week2.assignment_problems;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class StopWordFilteredWordFrequencyReport {
    public static void printFilteredWordFrequency(String feedback) {
        String cleaned = feedback.toLowerCase()
                .replace(".", "")
                .replace(",", "");
        String[] words = cleaned.split("\\s+");

        String[] stopWords = {"the", "was", "and", "a", "is", "of", "in"};
        Map<String, Integer> frequency = new HashMap<>();

        for (String word : words) {
            boolean isStopWord = false;
            for (String stop : stopWords) {
                if (word.equals(stop)) {
                    isStopWord = true;
                    break;
                }
            }
            if (!isStopWord && !word.isEmpty()) {
                frequency.put(word, frequency.getOrDefault(word, 0) + 1);
            }
        }

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(frequency.entrySet());
        entries.sort((a, b) -> Integer.compare(b.getValue(), a.getValue()));

        for (Map.Entry<String, Integer> entry : entries)
            System.out.println(entry.getKey() + ": " + entry.getValue());
    }

    public static void main(String[] args) {
        printFilteredWordFrequency("The mentor was great, the session was great and clear.");
    }
}
