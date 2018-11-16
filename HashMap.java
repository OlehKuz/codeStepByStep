/*
returns a new map whose contents are the intersection of the two maps:
the set of keys and values exist in both maps and keys map to the same value in both maps. 
*/

public HashMap<String, Integer> intersect(HashMap<String, Integer> map1,HashMap<String, Integer> map2){
    HashMap<String, Integer> common = new HashMap<String, Integer>();
    Iterator <String> it = map1.keySet().iterator();
    while(it.hasNext()){
        String name = it.next();
        if(map2.containsKey(name)){
            if(map1.get(name)==map2.get(name)){
                common.put(name, map1.get(name));
            }
        }
    }
    return common;
}
