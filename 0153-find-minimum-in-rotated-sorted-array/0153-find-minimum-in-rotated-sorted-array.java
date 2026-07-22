class Solution {
    public int findMin(int[] nums) {
        //int r=Arrays.stream(nums).min().getAsInt();
        //return r;
        int min=nums[0];
        for(int i=0;i<nums.length ; i++){
            if(nums[i]<min)
            min=nums[i];
        }
        return min;
    }
}