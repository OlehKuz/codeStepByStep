public class CaesarCipher extends ConsoleProgram {
    
    public void run() {
        String s = readLine("Your message? ");
        String st = s.toUpperCase();
        int code = readInt("Encoding key? ");
        String encoded = cypher(st, code);
        println(encoded);
        }  
    
    private String cypher (String message, int key){
        int len = message.length();
        String mess = "";
        for (int i = 0; i < len; i++){
            char ch = message.charAt(i);
            if (ch >= 'A' && ch <= 'Z'){
                ch += key;
                if (ch > 'Z'){
                    ch -= 26;
                }
                /* I was thinking about the case of 
                Letters near the end of the alphabet wrap around; for a shift of 3, X becomes A, and Y becomes B,
                and Z becomes C. But we also need to anticipate the case when we want to decript our message, then we will we 
                subtracting our key, and if we have letters in the beginning of alphabet, they can become some /%: characters, that is 
                why we need to wrap around also when characters are < 'A'*/
                
                
                if (ch < 'A'){
                    ch += 26;
                }
            }
            mess += ch;
        }
        return mess;     
    } 
}
