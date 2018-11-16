public boolean isSubMap(HashMap<String, String> m1, HashMap<String, String> m2){
    boolean sub = true;
    if(m1.size() > m2.size()) return false;
    for(String n : m1.keySet()){
        if(!m2.containsKey(n)||!m2.get(n).equals(m1.get(n))){
            return false;
        }
    }
    return sub;
}
