public String getMajorityLastName(HashMap<String, String> map){
    HashMap<String, Integer> surname = new HashMap<String, Integer>();
    int count = 0;
    for(String name : map.keySet()){
        String snm = map.get(name);
        count++;
        if(!surname.containsKey(snm)){
            surname.put(snm, 1);
        }else{
            surname.put(snm, surname.get(snm)+1);
        }
    }
    int half = count / 2;
    for(String s:surname.keySet()){
        if(surname.get(s)>half){
            return s;
        }
    }
    return "?";
}
