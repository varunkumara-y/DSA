class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxArea = Integer.MIN_VALUE;
        int left = 0;
        int right = n-1;
        while(left<right){
            int width = right-left;
            int minHeight = Math.min(height[left],height[right]);
            int area = width*minHeight;
            if(area>maxArea){
                maxArea = area;
            }
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
            
        return maxArea;
    }
}