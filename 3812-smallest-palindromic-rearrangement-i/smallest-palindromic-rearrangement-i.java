class Solution {
    public String smallestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }

        int n = s.length();

        // Take the first half
        char[] firstHalf = s.substring(0, n / 2).toCharArray();

        // Sort the first half
        Arrays.sort(firstHalf);

        // Build the palindrome
        StringBuilder ans = new StringBuilder();

        // Add sorted first half
        ans.append(firstHalf);

        // Add middle character for odd length
        if (n % 2 != 0) {
            ans.append(s.charAt(n / 2));
        }

        // Add reverse of first half
        for (int i = firstHalf.length - 1; i >= 0; i--) {
            ans.append(firstHalf[i]);
        }

        return ans.toString();
    }
}