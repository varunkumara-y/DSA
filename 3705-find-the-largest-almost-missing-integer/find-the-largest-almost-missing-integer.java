class Solution {
    public int largestInteger(int[] nums, int k) {
         int[] count = new int[51];

        // Generate every subarray of size k
        for (int start = 0; start <= nums.length - k; start++) {

            // Store distinct elements of current window
            Set<Integer> set = new HashSet<>();

            for (int j = start; j < start + k; j++) {
                set.add(nums[j]);
            }

            // This window contains each number once
            for (int x : set) {
                count[x]++;
            }
        }

        // Find largest number appearing in exactly one window
        for (int x = 50; x >= 0; x--) {
            if (count[x] == 1) {
                return x;
            }
        }

        return -1; 
    }
}