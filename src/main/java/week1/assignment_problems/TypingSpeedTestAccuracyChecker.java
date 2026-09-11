package week1.assignment_problems;

public class TypingSpeedTestAccuracyChecker {
    public static void checkTypingAccuracy(String original, String typed) {
        int matched = 0;
        int firstMismatch = -1;
        char originalChar = 0, typedChar = 0;

        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matched++;
            } else if (firstMismatch == -1) {
                firstMismatch = i;
                originalChar = original.charAt(i);
                typedChar = typed.charAt(i);
            }
        }

        double accuracy = (matched * 100.0) / original.length();
        System.out.printf("Matched: %d/%d | Accuracy: %.2f%%", matched, original.length(), accuracy);

        if (firstMismatch == -1) {
            System.out.println(" | No Mismatches");
        } else {
            System.out.println(" | First Mismatch at position " + (firstMismatch + 1)
                    + " ('" + originalChar + "' vs '" + typedChar + "')");
        }
    }

    public static void main(String[] args) {
        checkTypingAccuracy("hello world", "hello worlt");
    }
}
