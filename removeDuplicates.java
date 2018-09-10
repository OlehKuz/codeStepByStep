private String removeDuplicates (String s) {
    /* Need to check if String has any characters, in order to avoid 
        accessing the wrong memory  if i access s.charAt(0) of a string that has no 0 index*/
    int len = s.length();
    if (len >= 1){
        /* Save the first character, then compare if the next char is the same as previous. Add it to a string if 
            it is different*/
        char c = s.charAt(0);
        String shortend = s.substring(0, 1);
            for (int i = 1; i < len; i++) {
                char ch = s.charAt(i);
                if(ch != c){
                    shortend += ch;
                }
                c = ch;
            }
        return shortend;
        /* Still need to return an empty string in case the user provided no input (return s)*/
    }
    return s;
}
