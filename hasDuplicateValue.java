private boolean hasDuplicateValue(Map<String, String> map){
    boolean result = false;
    ArrayList<String> values = new ArrayList<String>();
    for(String name:map.keySet()){
        values.add(map.get(name));     
    }
    result = hasDuplicate(values);
    return result;
}
public boolean hasDuplicate(ArrayList<String> list){
boolean duplicate = false;
    int size = list.size();
        for(int i = 0; i < size; i++){
            String current = list.get(i);
            for(int j = i + 1; j < size; j++){
                if(current.equals(list.get(j))){
                    return true;
                }
            }
          
        }
    return duplicate;
    
}
