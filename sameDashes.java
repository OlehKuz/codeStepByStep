private boolean sameDashes (String s, String st) {
    int lenS = s.length();
    int lenSt = st.length();
    int min = Math.min(lenS,lenSt);
    int max = Math.max(lenS,lenSt);
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
