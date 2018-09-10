private boolean isVowel (String s) {
    int len = s.length();
    if (len == 1){
        return s.equalsIgnoreCase("a") 
            || s.equalsIgnoreCase("e") 
            || s.equalsIgnoreCase("i") 
            || s.equalsIgnoreCase("o") 
            || s.equalsIgnoreCase("u");

        }
    return false;
}
