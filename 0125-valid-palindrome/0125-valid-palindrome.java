class Solution {
    public boolean isPalindrome(String s) {
        // Remove all non-alphanumeric characters and convert to lowercase
        String s1 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Use StringBuilder for reversing
        StringBuilder rev = new StringBuilder(s1);
        rev.reverse();

        // Check if the reversed string matches the original
        return s1.equals(rev.toString());
    }
}