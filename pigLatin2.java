/*a modified version of the preceding pigLatin problem. In this modified version, if the word starts with constants, 
move all constants up to the first vowel (not just the first consonant) to the end, and append "ay". */


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
                /*  Idea: Loop through all the chars in s word. If we see a vovel, save index of 
                    that vovel, divide our word into  consonant and vovel part, add them to a string of 
                    modified words, then immediately break that loop, because we need the program to find only the
                    index of the first vovel and dont modify our string afterwards.
                    Also during our looping process save consonants into a separate string. Then, if we havent accounted 
                    any vovels during the looping process, we will add this string of only consonants to our final string 
                    "oneLine". If we accounted any vovels, the program will not add those consonants, because the previous 
                    condition will cause the program to break from a loop before we meet this condition
                    */
                
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
