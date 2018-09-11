/*Write a method named startEndLetter that accepts a character (char) as a parameter. 
The method repeatedly prompts the user to enter console input until 
the user types two consecutive words that both start and end with that letter.
The method then prints a message showing the last word typed.Your code should be case-insensitive;
If the user types a one-letter word, that word is considered to start and end with its single letter.
Assumptions: You may assume that the parameter value passed will be a lowercase letter from 'a' to 'z' inclusive. 
You may also assume that the user will type  a valid single-word response to each prompt and that the word 
will contain at least one character (the user will not type a blank line).*/

private void startEndLetter (char c) {
    printf("Looking for two \"%c\" words in a row.\n", c);
    int counter = 0;
    while(counter != 2){
        String s = readLine("Type a word: ");
        int len = s.length();
        char start = Character.toLowerCase(s.charAt(0));
        char end = Character.toLowerCase(s.charAt(len-1));
        if(c == start && start == end){
            counter++;
            if (counter == 2){
                printf("\"%c\" is for \"%s\"\n ", c, s);
            }
        }
        else {
            counter = 0;
        }
    }
    
}



