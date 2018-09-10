private String stutter (String s){
    String stut = "";
    int len = s.length();
    for (int i = 0; i < len; i++) {
        stut += s.charAt(i);
        stut += s.charAt(i);
    }
    return stut; 
} 
