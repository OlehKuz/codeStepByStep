Write a method named convertToAltCaps that accepts a string as a parameter and returns a version of the string 
where alternating letters are uppercase and lowercase, 
starting with the first letter in lowercase. For example, the call of convertToAltCaps("Pikachu") should return "pIkAcHu"

private String convertToAltCaps (String s) {
    String alt = "";
    /* convert my string to a lover case, because my new string has to begin w lover case */ 
    String st = s.toLowerCase();
    int len = st.length();
    
    /* Idea: set up a counter that will count letters. Letters should alternate between lower and upper case, so they can be 
    divided into two groups that correspond to even and odd numbers. Even numbers should be lowercase, because first letter which corresponds
    to index of 0 must be lowercase. If letter is odd, change it to uppercase.
    
    Important note: I started up 2 groups on base of if loop index is divisible by 2, without using a counter var. But this way spaces _ or 
    characters , + = are also counted , and my division of letters stops to function when the program meets the first char other than letter.
    That is why i need a separate counter var and this condition if (ch >= 'a' && ch <= 'z') {.....}    */
    
    int counter = 0;
    for (int i = 0; i < len; i ++) {
        char ch = st.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (counter % 2 != 0) {
                    ch = Character.toUpperCase(ch);            
                }
                counter ++;              
        }
        alt += ch;
    }
    return alt;
}
