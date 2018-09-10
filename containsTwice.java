private boolean containsTwice (String s, char ch) {
    int len = s.length();
    int counter = 0;
    for (int i = 0; i < len; i++){
        char c = s.charAt(i);
        if (c == ch){
            counter++;
        }
    }
    /* i can do a logical test in return statement to avoid unnecessary if statements*/
    return (counter >= 2);
}
