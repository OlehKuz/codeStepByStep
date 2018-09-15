private void pigLatin2 (Scanner input) { 
    while(input.hasNextLine()){
        String line = input.nextLine();
        Scanner readLine = new Scanner (line);
        String oneLine = "";
        while(readLine.hasNext()){
            String s = readLine.next();
            String sLower = s.toLowerCase();
            int startVovel = 0;
            String cons = "";
            String vovel = "";
            String noVovel = "";
            if (sLower.substring(0, 1).equals("a") ||
                sLower.substring(0, 1).equals("e") ||
                sLower.substring(0, 1).equals("i") ||
                sLower.substring(0, 1).equals("o") ||
                sLower.substring(0, 1).equals("u")){
                oneLine += s + "yay ";
            }
            else {
                int len = s.length();
                for(int i = 0; i < len; i++) {
                    if (sLower.substring(i, i + 1).equals("a") ||
                    sLower.substring(i, i + 1).equals("e") ||
                    sLower.substring(i, i + 1).equals("i") ||
                    sLower.substring(i, i + 1).equals("o") ||
                    sLower.substring(i, i + 1).equals("u")){
                        startVovel = i;
                        cons = s.substring(0, i);
                        vovel = s.substring(i);
                        oneLine += vovel + cons + "ay ";
                        break;
                        }
                    else {
                        noVovel += s.substring(i, i + 1);
                        if (i == len - 1) {
                            oneLine += noVovel + "ay ";
                        }
                    }
                    
                    }
                       
                }
                
            }
        println(oneLine);
        }    
    }
