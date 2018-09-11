/*  Write a method named sameDashes that accepts two strings as parameters and that returns a boolean
    value indicating whether or not they have dashes in the same places.
    To be considered a match, the strings must have exactly the same number of dashes in exactly the 
    same positions. Note that the strings might be of different length, but different-length strings 
    might still return true if it turns out that all of their dashes are in the range of indexes that 
    is within the bounds of the shorter string.
    */



private boolean sameDashes (String s, String st) {
    int lenS = s.length();
    int lenSt = st.length();
    int min = Math.min(lenS,lenSt);
    int max = Math.max(lenS,lenSt);
    /*  I need to compare strings in the same loop, because if I make two loops, one 
    for the shorter and one for the longer string, the loops will loop through all values, not only one index,
    and i will not be able to compare the value of two strings in each index.
    I need a loop that loops through the length of a smaller string, in order to avoid "index out of bounds error".
    */
        for (int i = 0; i < min; i++) {
            char c = s.charAt(i);
            char ch = st.charAt(i);
            if(ch == '-' || c == '-') {
                boolean compare = ch == c;
                if(!compare) {
                    return false;
                }
            }    
        }
        /*  Checking if a longer string has any '-' characters on a length, that is longer than the shorter string*/
        if (lenSt > lenS){
            for(int j = min; j < max; j++) {
                char cha = st.charAt(j);
                if(cha == '-') {
                    return false;
                }
            }
        }
        if (lenS > lenSt){
            for(int j = min; j < max; j++) {
                char cha = s.charAt(j);
                if(cha == '-') {
                    return false;
                }
            }
        } 
    return true;
}
