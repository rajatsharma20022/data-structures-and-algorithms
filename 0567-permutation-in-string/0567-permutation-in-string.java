class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
           return false;

        char[] s1C = s1.toCharArray();
        char[] s2C = s2.toCharArray();
        HashMap<Character, Integer> ch1 = new HashMap<>();
        HashMap<Character, Integer> ch2 = new HashMap<>();

        for (int i = 0; i < s1C.length; i++) {
            ch1.put(s1C[i], ch1.getOrDefault(s1C[i], 0) + 1);
            ch2.put(s2C[i], ch2.getOrDefault(s2C[i], 0) + 1);
        }
        int c = 0;
        for (int j = s1C.length; j < s2C.length; j++) {
            if (ch1.equals(ch2)) {
                return true;
            } else {
                ch2.put(s2C[c], ch2.get(s2C[c]) - 1);
                if(ch2.get(s2C[c])==0)
                ch2.remove(s2C[c]);

                ch2.put(s2C[j], ch2.getOrDefault(s2C[j], 0) + 1);
                c++;
                
            }
        }
        return ch1.equals(ch2);

    }
}