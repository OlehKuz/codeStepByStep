/*
Notice that the duplicate characters have been removed from each word in the file, retaining 
the given line breaks that were present in the file originally. You may assume 
that the given file exists and is readable. You may also assume that each word on each line of 
the file is separated by a single space.
*/

private void removeDuplicatesFromFile (String file) {
    try{
        Scanner doc = new Scanner(new File(file));
        while(doc.hasNextLine()){
            String s = doc.nextLine();
            String line = removeDuplicates(s);
            println(line);           
        }
    }catch (FileNotFoundException ex){ 
        println("Your bad");
    }
}

private String removeDuplicates (String s) {
    int len = s.length();
    if (len >= 1){    
        char c = s.charAt(0);
        String shortend = s.substring(0, 1);
            for (int i = 1; i < len; i++) {
                char ch = s.charAt(i);
                if(ch != c){
                    shortend += ch;
                }
                c = ch;
            }
        return shortend;
    }
    return s;
}
