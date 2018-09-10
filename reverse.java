/* I cannot assign a character value to a string variable, or when 
  declaring a string var i cannot say String s += ch;  But i can declare 
  a string var and assign it a value of "", but then in a loop to add character values 
  to my string var:    rever += s.charAt(i);           */
  
private String reverse (String s) {
    String rever = "";
    int count = s.length();
    for (int i = count - 1; i >= 0; i-- ) {
        rever += s.charAt(i);
    }
    return rever;
}

