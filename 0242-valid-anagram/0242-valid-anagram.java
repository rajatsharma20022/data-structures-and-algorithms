class Solution {
    public boolean isAnagram(String s, String t) {
         int len1=s.length();
         int len2=t.length();
            
            //if(len1==len2){
            // HashMap<Character,Integer> map_s= new HashMap<>();
            // HashMap<Character,Integer> map_t =new HashMap<>();
            // for(char ch:s.toCharArray()){
            //     map_s.put(ch,map_s.getOrDefault(ch,0)+1);
            //     }
            //     for(char ch1:t.toCharArray()){
            //         map_t.put(ch1, map_t.getOrDefault(ch1,0)+1);
            //     }
            //    if(map_s.equals(map_t))
            //    return true;
            //    }
            // return false;

            if(s.length() != t.length()) return false;
            
                int [] count=new int[26];
                for(int i=0; i<s.length();i++)
                {   
                count[s.charAt(i)-'a']++;
                count[t.charAt(i)-'a']--;
                }
            

             for(int i:count){
                if(i!=0)
                return false;
             }
             return true;

            
     }
}
