/*  isPalindrome that accepts a string parameter and returns 
true if that string is a palindrome, or false if it is not a palindrome.

For this problem, a palindrome is defined as a string that contains exactly 
the same sequence of characters forwards as backwards, case-insensitively.
The empty string and all one-character strings are palindromes by our definition.*/


private boolean isPalindrome (String s){
    int len = s.length();
    String st = s.toLowerCase();
    if(len > 0){
        for(int i = 0; i < len; i++){
            char c = st.charAt(i);
            char ch = st.charAt(len-1-i);
            if (c != ch){
                return false;
            }
        }
    }
    return true;
}
