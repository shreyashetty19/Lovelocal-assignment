
//You are given a string s. You can convert s to a palindrome by adding characters in front of it.
//Return the shortest palindrome you can find by performing this transformation.


class Solution {
    
    public String shortestPalindrome(String s) {
        int i = 0;  
        int j = s.length() - 1; 
        
        while (j >= 0) {
    // Move the pointers towards each other as long as the characters are equal
            if (s.charAt(i) == s.charAt(j)) {
                i++;
            }
            j--;
        }
        
              if (i == s.length()) {
            return s;
        }
 
        // Extract the suffix of the string from the character at index 'i'
        String suffix = s.substring(i);
        
        // Create the prefix by reversing the suffix
        String prefix = new StringBuilder(suffix).reverse().toString();
        
        String mid = shortestPalindrome(s.substring(0, i));
        
        return prefix + mid + suffix;
    }
}
