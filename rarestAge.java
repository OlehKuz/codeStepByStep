public int rarestAge(HashMap<String, Integer> map){
    HashMap<Integer, Integer> age = new HashMap<Integer, Integer>();
    ageFrequency(map, age);
    int rarest = 0;
    int rarestAge = 0;
    for(Integer ag:age.keySet()){
        Integer frequency = age.get(ag);
        if(rarest == 0 && rarestAge == 0 ){
            rarest = frequency;
            rarestAge = ag;            
        }
        if(frequency<rarest){
            rarest = frequency;
            rarestAge = ag;
        }
        else if(frequency == rarest && ag<rarestAge){
            rarestAge = ag;
        }
    }
    return rarestAge;
}

public void ageFrequency(HashMap<String, Integer> map, HashMap<Integer, Integer> age){
    int count = 0;
    for(String name : map.keySet()){
        Integer alter = map.get(name);
        count++;
        if(!age.containsKey(alter)){
            age.put(alter, 1);
        }else{
            age.put(alter, age.get(alter)+1);
        }
    }
}
