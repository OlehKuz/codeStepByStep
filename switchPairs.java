/*  Write a method named switchPairs that accepts a string as a parameter and returns 
that string with each pair of neighboring letters reversed. If the string has an odd number of letters, 
the last letter should not be modified. For example, the call switchPairs("example") 
should return "xemalpe" and the call switchPairs("hello there") should return "ehll ohtree"

Swithing each pair of neighboring letters  can be achieved by first adding the char at the next index and only then adding 
the char of a previous index. We need to make a loop that has a step size of 2, so that we can add a value of the string w current index and 
the value of string w an index one less than the current counter value. This way we still add all the values of a string, because we add two 
values in one run of a loop. The problem is that w step size of 2 we can loop completely only through strings w an even lenght. For example 
we can reach index of 1 + multiple of 2, which gives us odd index. Odd index represents string w an even length, because index starts from 0,
and string length is counted starting at 1. That is why we loop through the largest even length we can fit into our string, and then if
our string has odd length, we simply add its last character to the characters accumulated from running a for loop */

private String switchPairs (String s) {
    String newS = "";
    int len = s.length();
    for (int i = 1; i < len; i+=2){
            newS += s.charAt(i);
            newS += s.charAt(i - 1);
        }
    if (len % 2 != 0) {
        newS += s.charAt(len - 1);
    }
    return newS;
}
