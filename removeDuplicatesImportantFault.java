/*this code works fine if i have at least 1 character of input. But it fails if there is no input, 
when i access the char at the index 0 of the string s.charAt(0), but because there is no string, I access 
memory, I shouldnt be touching. That is why i have to ALWAYS test the length of a string and do all the 
logical operations needed to solve a task , if it is at least of length 1.

test #7:removeDuplicates("")
expected return:""
your return:none
exception:StringIndexOutOfBoundsException: String index out of range: 0 */

private String removeDuplicates (String s) {
    char c = s.charAt(0);
    String shortend = s.substring(0, 1);
    int len = s.length();
        for (int i = 1; i < len; i++) {
            char ch = s.charAt(i);
            if(ch != c){
                shortend += ch;
            }
            c = ch;
        }
    return shortend;
}
