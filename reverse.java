public HashMap<String, Integer> reverse(HashMap<Integer, String> map1){
    HashMap<String, Integer> reversed = new HashMap<String, Integer>();
    for(Integer n : map1.keySet()){
        if(!reversed.containsKey(map1.get(n))){
            reversed.put(map1.get(n),n);
        }
    }
    return reversed;
}
