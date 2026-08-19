import java.util.*;

class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        // Store reserved seats for each row
        for (int[] seat : reservedSeats) {
            int row = seat[0];
            int col = seat[1];

            map.putIfAbsent(row, new ArrayList<>());
            map.get(row).add(col);
        }

        // Rows with no reservations can always accommodate 2 groups
        long count = (long) (n - map.size()) * 2;

        // Process only rows that have reservations
        for (ArrayList<Integer> seats : map.values()) {

            boolean[] reserved = new boolean[11];

            for (int seat : seats) {
                reserved[seat] = true;
            }

            boolean left =
                    !reserved[2] &&
                    !reserved[3] &&
                    !reserved[4] &&
                    !reserved[5];

            boolean right =
                    !reserved[6] &&
                    !reserved[7] &&
                    !reserved[8] &&
                    !reserved[9];

            boolean middle =
                    !reserved[4] &&
                    !reserved[5] &&
                    !reserved[6] &&
                    !reserved[7];

            if (left && right) {
                count += 2;
            } else if (left || middle || right) {
                count++;
            }
        }

        return (int) count;
    }
}