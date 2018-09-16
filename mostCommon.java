private String mostCommon (String file) {
    String frequent = "";
    
    try {
        Scanner scan = new Scanner(new File(file));
        String current = scan.next();
        frequent = current;
        int max = 1;
        int count = 1;
        
        while(scan.hasNext()){
            String s = scan.next();
            if (current.equals(s)){
                count ++;
            }
            else if(!current.equals(s)){
                count = 1;
                current = s;
            }
            if (count > max){
                max = count;
                frequent = current;
            }        
        }
        
    }
    catch (FileNotFoundException ex) {
    }
    return frequent;
}
