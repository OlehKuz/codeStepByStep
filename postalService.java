public HashMap<String, String> postalService(HashMap<String, Integer> people, HashMap<Integer, String> cities){
    HashMap<String, String> cityCustomer = new HashMap<String, String>();
    for(String name:people.keySet()){
        String surname = addSurname(name);
        Integer zip = people.get(name);
        if(cityCustomer.containsKey(cities.get(zip))){
            cityCustomer.put(cities.get(zip), cityCustomer.get(cities.get(zip)) + " and " + surname);
        }
        else{
            cityCustomer.put(cities.get(zip), surname);
        }
    }
    return cityCustomer;
}



public String addSurname(String nameSurname){
    String surname = "";
    int len = nameSurname.length();
    for(int i = len-1; i>=0; i--){
        if(nameSurname.substring(i, i+1).equals(" ")){
            break;
        }
        surname = nameSurname.substring(i, i+1) + surname;        
    }
    return surname;
    
}
