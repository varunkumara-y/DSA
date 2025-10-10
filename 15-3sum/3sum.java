class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<n-1;i++){
            int target = -nums[i];
            HashSet<Integer> seen = new HashSet<>();
            for(int j=i+1;j<n;j++){
                int complement = target - nums[j];
                    if(seen.contains(complement)){
                        List<Integer> triplet = Arrays.asList(nums[i],nums[j],complement);
                        Collections.sort(triplet);
                        set.add(triplet);
                    }
                    seen.add(nums[j]);
                }
            }
        return new ArrayList<>(set);
        }
        
    }