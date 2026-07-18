class Solution {
    public boolean isPalindrome(String s) {
        int start =0;
        int end =s.length()-1;
        char ch;
        char ch2;
        while(start <end){
            while(start <end && String.valueOf(s.charAt(start)).matches("[^a-zA-Z0-9]") ){
                start++;
            }
           while(start <end && String.valueOf(s.charAt(end)).matches("[^a-zA-Z0-9]") ){
                end--;
            }
            if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end)))

            return false;
            start++;
            end--;
        }
        return true;
        
    }
}