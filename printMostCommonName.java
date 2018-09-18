/*
  All occurrences of a given name will appear consecutively in the file. 
  Your method's job is to print the name that occurs the most frequently in the file, 
  along with how many times it occurs. You should also return the total number of unique names that were seen in the entire file.
  If two or more names occur the same number of times, print the one that appears earlier in the file.
  If the file does exist, you may assume that it contains at least one name. */


private int printMostCommonName (String file) {
    int unique = 0;
    String frequent = "";
    
    try {
        Scanner scan = new Scanner(new File(file));
        String current = scan.next();
        frequent = current;
        int max = 1;
        int count = 1;
        unique++;
        
        while(scan.hasNext()){
            String s = scan.next();
            if (current.equals(s)){
                count ++;
            }
            else if(!current.equals(s)){
                count = 1;
                current = s;
                unique++;
            }
            if (count > max){
                max = count;
                frequent = current;
            }        
        }
        printf("Most common name: %s, %d\n",frequent, max);
        
        
    }
    catch (FileNotFoundException ex) {
    }
    return unique;
}
