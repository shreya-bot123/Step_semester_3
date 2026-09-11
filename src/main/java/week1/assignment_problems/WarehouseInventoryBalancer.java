package week1.assignment_problems;

public class WarehouseInventoryBalancer {
    public static void analyzeInventory(int[] sectionA, int[] sectionB) {
        int totalA = 0, totalB = 0;
        int highest = Integer.MIN_VALUE;
        String section = "";
        int item = -1;

        for (int i = 0; i < sectionA.length; i++) {
            totalA += sectionA[i];
            if (sectionA[i] > highest) {
                highest = sectionA[i];
                section = "A";
                item = i + 1;
            }
        }

        for (int i = 0; i < sectionB.length; i++) {
            totalB += sectionB[i];
            if (sectionB[i] > highest) {
                highest = sectionB[i];
                section = "B";
                item = i + 1;
            }
        }

        String status = totalA == totalB ? "Balanced" : "Not Balanced";
        System.out.println("Section A Total: " + totalA + " | Section B Total: " + totalB
                + " | Status: " + status + " | Highest Quantity: " + highest
                + " (Section " + section + ", Item " + item + ")");
    }

    public static void main(String[] args) {
        analyzeInventory(new int[]{20, 15, 30}, new int[]{25, 10, 30});
    }
}
