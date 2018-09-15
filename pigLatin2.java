/*this shit gives me infinite loop. The problem is in the else part of the program*/


private void pigLatin2 (Scanner input) { 
    while(input.hasNextLine()){
        String line = input.nextLine();
        Scanner readLine = new Scanner (line);
        String oneLine = "";
        while(readLine.hasNext()){
            String s = readLine.next();
            String cons = "";
            String vovel = "";
            
            if (s.substring(0, 1).equals("a") ||
                s.substring(0, 1).equals("e") ||
                s.substring(0, 1).equals("i") ||
                s.substring(0, 1).equals("o") ||
                s.substring(0, 1).equals("u")){
                oneLine += s + "yay ";
            }
            else {
                int len = s.length();
                for(int i = 0; i < len; i++) {
                    while (!(s.substring(i, i + 1).equals("a") ||
                    s.substring(i, i + 1).equals("e")  ||
                    s.substring(i, i + 1).equals("i")  ||
                    s.substring(i, i + 1).equals("o")  ||
                    s.substring(i, i + 1).equals("u"))){
                        cons +=s.substring(i, i + 1);
                    }
                    vovel += s.substring(i, i + 1);
                       
                }
                oneLine += vovel + cons + "ay ";
            }
        }
        println(oneLine);
    }
}
