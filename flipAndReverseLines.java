private int flipAndReverseLines(){
    int linesCount = 0;
    try{
        String name = readLine("Input file name? ");
        File f = new File(name);
        while(!f.exists()){
            println("Unable to open that file.  Try again.");
            name = readLine("Input file name? ");
            f = new File(name);
        }
        println();
        Scanner scan = new Scanner(f);      
        while(scan.hasNextLine()){
            /*  While condition tells me if there is one line, and I need to read two lines during one loop.
                That is why I need to include another if(scan.hasNextLine()) condition inside of while statement,
                in order to avoid the following failure:
                " threw·NoSuchElementException:
                > No·tokens·remain·in·input.··Near·input·line·10"
                I was trying to read a second line, when there was no second line.
                
                Also if "if statement " is true , I need to change the default value of uppercase string "a" into 
                lowercase (in case there is only 1 line or odd number of lines string a has to be uppercase  */
            
            String a = scan.nextLine().toUpperCase();
            linesCount++;
            if(scan.hasNextLine()){
            String b = scan.nextLine().toUpperCase();
                linesCount++;
                String bRever = reverse(b);
                println(bRever);
                a = a.toLowerCase();
            }
            String aRever = reverse(a); 
            println(aRever);
        }
        
    }
    catch(FileNotFoundException ex) {
    }
    return linesCount;
}



private String reverse (String s) {
    String rever = "";
    int count = s.length();
    for (int i = count - 1; i >= 0; i-- ) {
        rever += s.charAt(i);
    }
    return rever;
}


