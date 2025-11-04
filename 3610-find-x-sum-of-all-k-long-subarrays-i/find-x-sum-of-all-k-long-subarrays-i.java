class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int [] ans = new int[n-k+1];
        Map<Integer,Integer> freq = new HashMap<>();

        Comparator<int[]> comp = (a,b) -> {
            if(a[1]==b[1]) return b[0]-a[0];
            return b[1]-a[1];
        };

        PriorityQueue<int[]> pq = new PriorityQueue<>(comp);

        for(int i=0;i<k;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        ans[0]=getXSum(freq,x,pq,comp);

        for(int i=k;i<n;i++){
            int remove = nums[i-k];
            int add = nums[i];

        freq.put(remove,freq.get(remove)-1);
        if(freq.get(remove)==0) freq.remove(remove);

        freq.put(add, freq.getOrDefault(add,0)+1);

        ans[i-k+1]=getXSum(freq,x,pq,comp);
    }
    return ans;
        
    }

    private int getXSum(Map<Integer,Integer> freq,int x, PriorityQueue<int[]> pq,Comparator<int[]> comp){
        pq.clear();
        for(Map.Entry<Integer,Integer> e: freq.entrySet()){
            pq.offer(new int[]{e.getKey(),e.getValue()});
        }

        int sum=0;
        for(int i=0;i<x&&!pq.isEmpty();i++){
            int [] cur = pq.poll();
            sum+=cur[0]*cur[1];
        }
        return sum;
    }
}