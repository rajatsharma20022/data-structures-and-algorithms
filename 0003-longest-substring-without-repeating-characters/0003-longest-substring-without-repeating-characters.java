class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        char arr[]=s.toCharArray();
        int right=0;
        int res=0;
        HashMap<Character,Integer> mp=new HashMap<>();
        for(;right<arr.length;right++){
            int idx=mp.getOrDefault(arr[right],-1);
            if(idx !=-1 && idx >=l){
                res=Math.max(res,right-1 -l +1);
                l=idx+1;
                mp.remove(arr[right]);

            }
            mp.put(arr[right],right);

        }
        return Math.max(res,right-1 -l +1);
        
    }
}