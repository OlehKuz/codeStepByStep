private String removeDuplicates (String s) {
    int len = s.length();
    if (len >= 1){    
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
    }
    return s;
}
