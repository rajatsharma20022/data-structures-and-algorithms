class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer>mp=new HashMap<>();
        int l=0;
        int maxf=0; int res=0;
        char [] arr=s.toCharArray();
        for(int r=0;r<arr.length;r++){
            mp.put(arr[r],mp.getOrDefault(arr[r],0)+1);
            maxf=Math.max(maxf,mp.get(arr[r]));

            while((r-l+1) -maxf > k)
            {
                mp.put(arr[l],mp.get(arr[l]) -1);
                l++;
            }
            res=Math.max(res,r-l+1);

        }
        return res;
        
    }
}