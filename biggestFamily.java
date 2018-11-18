/*
  Reads an input file of people's names and prints information about which family 
  has the most people in it. Your method accepts a string parameter representing a filename of input. 
  You may assume that every line follows this exact format and that first and last names are single words. 
*/


public void biggestFamily(String file){
    HashMap <String, String> namesFamily = new HashMap <String, String>();
    HashMap <String, Integer> frequentFamily = new HashMap <String, Integer>();
  
  /* adds all names from file that have the same surname to one family key in namesFamily hashMap
      counts the frequency of each surname among people passed in a file
  */
    try{
        Scanner input = new Scanner(new File(file));
        while(input.hasNextLine()){
        String line = input.nextLine();
        Scanner words = new Scanner(line);
        String name = words.next();
        String surname = words.next();
        if(!namesFamily.containsKey(surname)){
            namesFamily.put(surname, name);
        }
        else if (namesFamily.containsKey(surname)){
            namesFamily.put(surname, namesFamily.get(surname)+" " + name);
        }
        
        if(!frequentFamily.containsKey(surname)){
            frequentFamily.put(surname, 1);
        }
        else if(frequentFamily.containsKey(surname)){
            frequentFamily.put(surname,frequentFamily.get(surname)+1);
        }
    }
    } catch(FileNotFoundException ex){
        println("(");
    }
    String frequentFamilies = findfrequent(frequentFamily);
    printFamilies(frequentFamilies, namesFamily);
   
}

//prints members of biggest family(ies)
public void printFamilies(String frequentFamilies, HashMap <String, String> namesFamily){
    StringTokenizer tokens = new StringTokenizer(frequentFamilies);
    while(tokens.hasMoreTokens()){
        String token = tokens.nextToken();
        String namesInFamily = namesFamily.get(token);
        //namesInFamily = alphabeticOrder(namesInFamily);
        println(token + " family: " + namesInFamily);
    }
}


 /*public String alphabeticOrder(String names){
        
    }*/
// finds the most frequent surname(s)
public String findfrequent(HashMap <String, Integer> map){
    String frequent = "";
    Integer max = 0;
    for(String family:map.keySet()){
        if(map.get(family)>max){
            max = map.get(family);
        }
    }
    for(String family:map.keySet()){
        if(map.get(family) == max){
            frequent+=family+" ";
        }
    }
    return frequent;
}
