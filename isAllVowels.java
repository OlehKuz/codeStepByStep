/* I can either eject one character or a single value string using s.charAt(i) method or s.substring(i, i+1),
but when I need to send this character to check if it is a vowel to isVowel(String s) method, this method
will not accept character value and will throw an error. If i want to use a method that has String as its format parameters, 
I cannot supply it with character value*/

private boolean isAllVowels (String s) {
    int len = s.length();
    for (int i = 0; i < len; i++){
        String  ch = s.substring(i, i+1);
        
        /*char ch = s.charAt(i) would be impossible to supply to isVowel(ch) method. It would throw an error of incompatible types*/
        if (!isVowel(ch)){
            return false;
        }
    }
    return true;
}
