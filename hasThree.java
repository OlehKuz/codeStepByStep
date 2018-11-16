private boolean hasThree(ArrayList<String> list){
    boolean occurs = false;
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    Iterator<String> it = list.iterator();
    while(it.hasNext()){
        String word = it.next();
        if(map.containsKey(word)){
             map.put(word, map.get(word)+1);
            if(map.get(word)==3){
                return true;
            }
        }
        else{
            map.put(word, 1);
        }
    }
    return occurs;
}
