class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int l=nums.length;
        int max_count=1;
        int c=1;
        if(l==0)
        return 0;

        for(int i=0; i<l-1; i++){
            if(nums[i+1] == nums[i]+1)
            c++;
            else if(nums[i] == nums[i+1]) 
            {
                continue;
            }
            else {
                max_count = Math.max(max_count, c);
                c=1;
                
            }
            max_count = Math.max(max_count, c);

        }
        return max_count;
        
    }
}