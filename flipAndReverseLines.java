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


