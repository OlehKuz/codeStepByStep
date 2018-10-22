private int wordCount (String s) {
    s = s.toLowerCase();
    int len = s.length();
    int words = 0;
    if (len > 0){
        int startIndex = 0;
        for (int i = 0; i < len; i++){
            char c = s.charAt(i);
            
            /*  use ' ' as dividers between substrings, and check if there are any vovel characters 
                between them. Set last '' as new starting index for a substring that we check the next time
            */
            
            if (c == ' '){           
                for(int j = startIndex; j < i; j++){
                    if(s.charAt(j) >= 'a' && s.charAt(j)<='z'){
                        words++;
                        break;
                    }
                }
                startIndex = i;
            }
        }
        
        /*  this is a wire - post problem, we have one less '' than words, so we need to do one more 
            check out of a regular loop, from index of a last '' to end of a string
        */
        for (int i = startIndex; i < len; i++){
            if(s.charAt(i) >= 'a' && s.charAt(i)<='z'){
                words++;
                break;
            }
        }
    }  
    return words;
}
