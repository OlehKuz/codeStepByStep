/* Write a method named removeAll that accepts a string and a character as parameters, and removes all occurrences of the character. 
For example, the call of removeAll("Summer is here!", 'e') should return "Summr is hr!". 
Do not use the string replace method in your solution. */

private String removeAll (String s , char c) {
    String removed = "";
    int len = s.length();
    for (int i = 0; i < len; i++) {
        char ch = s.charAt(i);
        if (ch != c){
            removed += ch;
        } 
    }
    return removed;   
}
