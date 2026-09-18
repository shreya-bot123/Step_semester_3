package week2.practice_problems;

public class BankTransactionReferenceGenerator {
    static String normalizeReference(String raw) {
        String reference = raw.trim();
        return reference.substring(0, 3).toUpperCase()
                + reference.substring(3);
    }

    static String validateAndFormat(String reference) {
        if (reference.length() != 14)
            return "Invalid: wrong length";

        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(reference.charAt(i)))
                return "Invalid: bank code must be 3 letters";
        }

        for (int i = 3; i < reference.length(); i++) {
            if (!Character.isDigit(reference.charAt(i)))
                return "Invalid: body must contain only digits";
        }

        return "[" + reference.substring(0, 3) + "] DATE: "
                + reference.substring(3, 9) + " | SEQ: "
                + reference.substring(9);
    }

    public static void main(String[] args) {
        String raw = " hdf03022600042 ";
        String normalized = normalizeReference(raw);

        System.out.println(validateAndFormat(normalized));
        System.out.println(validateAndFormat(normalizeReference("12F03202600042")));
    }
}
