public void removePalindromes(String[] array){
    for(int i = 0; i < array.length; i++){
        boolean isPalindrome = isPalindrome(array[i]);
        if(isPalindrome){
            array[i] = "";
        }
    }
}

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
