/*  fails if there are space characters after the last word - it sees that the previous char is not 
 " " and thinks that it is space between words*/

private int countWords (String s) {
    int len = s.length();
    if (len > 0){
        int words = 0;
        char ch = s.charAt(0);
        for (int i = 0; i < len; i++){
            char c = s.charAt(i);
            if (c == ' ' && c != ch){
                words++;
            }
            ch = c;
        }
        return (words + 1);
        }  
    return 0;
}
