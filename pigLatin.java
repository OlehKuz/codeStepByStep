private void pigLatin (Scanner input) { 
    while(input.hasNextLine()){
        String line = input.nextLine();
        Scanner readLine = new Scanner (line);
        String oneLine = "";
        while(readLine.hasNext()){
            String s = readLine.next();
            if (s.substring(0, 1).equals("a") ||
                s.substring(0, 1).equals("e") ||
                s.substring(0, 1).equals("i") ||
                s.substring(0, 1).equals("o") ||
                s.substring(0, 1).equals("u")){
                oneLine += s + "yay ";
            }
            else {
                oneLine += s.substring(1) + s.substring(0,1) + "ay ";
            }
        }
        println(oneLine);
    }
}
