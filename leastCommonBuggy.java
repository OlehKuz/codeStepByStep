/*returnLeast method doesnt work, has a bug. I cant understand this dumb Integer int system, i Guess there is a bug with
this transformation from Integer to int, so it doesnt compute properly*/

public int leastCommon(HashMap<String, Integer> map){
    HashMap<Integer, Integer> valueTimes = new HashMap<Integer, Integer>();
    ArrayList<Integer> copy = new ArrayList<Integer>();
    int least = 0;
    try{
        for(String name:map.keySet()){
            copy.add(map.get(name));
        }
        countRepeats(copy,valueTimes);
        least = returnLeast(valueTimes);
    }catch(IllegalArgumentException ex){
        return -1;
    }
    return least;
}

public void countRepeats(ArrayList<Integer> list, HashMap<Integer, Integer> mapValue){
    int size = list.size();
        for(int i = 0; i < size; i++){
            int count = 0;
            Integer current = list.get(i);
            for(int j = i + 1; j < size; j++){
                if(current==list.get(j)){
                    count++;
                }
            }
            mapValue.put(current, count);         
        }    
}

public int returnLeast(HashMap<Integer, Integer> valueOccurence){
    int least = 0;
    int valueMin = 0;
    for(Integer value:valueOccurence.keySet()){
        Integer occurence = valueOccurence.get(value);
        if(least==0){
	            least = occurence;
	            valueMin = value;
	        }
        else if(occurence < least){
            least = occurence;
            valueMin = value;
        }
        else if(occurence == least && value < valueMin){
	            least = occurence;
	            valueMin = value;
	        }
    }
    return valueMin;
}
