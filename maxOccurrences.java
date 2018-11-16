/*
accepts a list of integers as a parameter and returns the number 
of times the most frequently occurring integer (the "mode") occurs in the list.
*/

public int maxOccurrences(ArrayList<Integer> list){
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    int occur = 0;
    Iterator <Integer> it = list.iterator();
    while(it.hasNext()){
        Integer num = it.next();
        if(!map.containsKey(num)){
            map.put(num, 1);
        }
        else{
            map.put(num, map.get(num)+1);
        }
    }
    occur = countMax(map);
    return occur;
}

public int countMax(HashMap<Integer, Integer> map1){
    int max = 0;
    for(Integer num : map1.keySet()){
        if(map1.get(num)>max){
            max = map1.get(num);
        }
    }
    return max;
}
