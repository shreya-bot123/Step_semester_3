package week1.practice_problems;

public class ReverseCustomerName {
    static String reverseCustomerName(String customerName) {
        StringBuilder result = new StringBuilder();

        for (int i = customerName.length() - 1; i >= 0; i--) {
            result.append(customerName.charAt(i));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String customerName = "Sunil";

        System.out.println("Original Name: " + customerName);
        System.out.println("Reversed Name: " + reverseCustomerName(customerName));
    }
}
