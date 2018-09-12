/* Write a method named reverseChunks that accepts a string s and integer k as parameters 
and returns a new string that reverses the relative order of every k characters of s. 
For example, the call of reverseChunks("MehranSahami", 3) should view the string in groups
of 3 characters at a time, reversing "Meh" into "heM", and "ran" into "nar", and so on, 
returning a result of "heMnarhaSima". If the string's length is not an exact multiple of k, 
the last chunk of fewer-than-k characters at the end of the string should be left in its original order.
You may assume that the value passed for k will be a positive integer.*/


private String reverseChunks (String s, int k){
    int len = s.length();
    if (len >= k) {
        String revChunk = "";
        // reverse string
        for (int i = 0; i <= len - k; i+=k){
            for(int j = k + i -1; j >=i; j--){
            revChunk += s.charAt(j);
            }
        }
        // attach unchanged chunk of original string 
        int done = (len/k) * k;
        for (int i = done; i < len; i++) {
            revChunk += s.charAt(i);
        }

    return revChunk;
    }
    return s;
}
