package week2.assignment_problems;

public class LibraryISBNNormalizerValidator {
    public static String normalizeCode(String raw) {
        String code = raw.trim();
        if (code.length() < 3) return code.toUpperCase();
        return code.substring(0, 3).toUpperCase() + code.substring(3);
    }

    public static String validateAndFormat(String code) {
        String normalized = normalizeCode(code);
        if (normalized.length() != 13) return "Invalid: wrong length";

        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(normalized.charAt(i)))
                return "Invalid: publisher code must be 3 letters";
        }
        for (int i = 3; i < 13; i++) {
            if (!Character.isDigit(normalized.charAt(i)))
                return "Invalid: body must contain 10 digits";
        }

        return "[" + normalized.substring(0, 3) + "] YEAR: "
                + normalized.substring(3, 7) + " | CATALOG: " + normalized.substring(7);
    }

    public static void main(String[] args) {
        System.out.println(validateAndFormat(" pen2026004251 "));
    }
}
