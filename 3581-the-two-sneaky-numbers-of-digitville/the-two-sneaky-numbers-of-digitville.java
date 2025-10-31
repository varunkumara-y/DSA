class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int num:nums){
            if(!set.add(num)){
                result.add(num);
            }
        }
        Collections.sort(result);
        return new int[] {result.get(0),result.get(1)};

        }
        
    }