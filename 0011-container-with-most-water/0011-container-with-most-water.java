class Solution {
    public int maxArea(int[] height) {
        int max =0;
        int l=0;
        int r=height.length -1;
        int currarea =0;
        while(l < r){
            currarea=Math.min(height[l], height[r]) * (r-l);
            max=Math.max(max,currarea);
            int update=height[l]<=height[r] ? l++ : r--;
        }
        return max;
        
    }
}