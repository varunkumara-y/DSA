class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int ones = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                ones++;
            }
        }

        String paddedS = "1" + s + "1";
        List<Integer> zeroRuns = new ArrayList<>();

        int length = 0;

        for (char c : paddedS.toCharArray()) {
            if (c == '0') {
                length++;
            } else if (length > 0) {
                zeroRuns.add(length);
                length = 0;
            }
        }

        if (zeroRuns.size() < 2) {
            return ones;
        }

        int best = 0;

        for (int i = 0; i + 1 < zeroRuns.size(); i++) {
            best = Math.max(
                best,
                zeroRuns.get(i) + zeroRuns.get(i + 1)
            );
        }

        return ones + best;
    }
}