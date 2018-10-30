public class WordCount extends ConsoleProgram{
    public void run(){
        String file = readLine("File: ");
        fileScan(file);
        printFile();
    }
    
    private void fileScan(String file) {
        try{
            Scanner input = new Scanner (new File (file));
            while (input.hasNextLine()){
                lines++;
                String line = input.nextLine();
                chars += line.length();
               tokenize(line);
                
            }
        }
        catch(FileNotFoundException ex){        
        }
    }
    
    private void tokenize(String line){
        StringTokenizer tokenizer = new StringTokenizer(line, DELIMETERS);
        while(tokenizer.hasMoreTokens()){
            String token = tokenizer.nextToken();
            words++;
           // checkIfWord(token);
        }
    }
    
    /*private void checkIfWord(String sequence){
        for(int i = 0; i < sequence.length(); i++){
            if(!Character.isLetterOrDigit(sequence.charAt(i))){
                return;
            }
        }
        words++;
    }*/
    
    private void printFile(){
        println("Lines = " + lines);
        println("Words = " + words);
        println("Chars = " + chars);
    }
     private static final String DELIMETERS = ", '\"-";
     private int words = 0;
     private int lines = 0;
     private int chars = 0;
    
}
