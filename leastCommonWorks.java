public int leastCommon(HashMap<String, Integer> map){
    HashMap<Integer, Integer> valueTimes = new HashMap<Integer, Integer>();
    try{
        if(!map.isEmpty()){
            for(String name:map.keySet()){
                Integer num = map.get(name);
                if(!valueTimes.containsKey(num)){
                    valueTimes.put(num, 1);
                }
                else{
                    valueTimes.put(num, valueTimes.get(num) + 1);
                }   
            }
        }
    }catch(IllegalArgumentException ex){
     
    }
    int min = returnLeast(valueTimes);
    return min;
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
