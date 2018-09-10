Write a method named convertToAltCaps that accepts a string as a parameter and returns a version of the string 
where alternating letters are uppercase and lowercase, 
starting with the first letter in lowercase. For example, the call of convertToAltCaps("Pikachu") should return "pIkAcHu"

private String convertToAltCaps (String s) {
    String alt = "";
    String st = s.toLowerCase();
    int len = st.length();
    int counter = 0;
    for (int i = 0; i < len; i ++) {
        char ch = st.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (counter % 2 != 0) {
                    ch = Character.toUpperCase(ch);            
                }
                counter ++;              
        }
        alt += ch;
    }
    return alt;
}
