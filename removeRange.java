public void removeRange(ArrayList list, int min, int max){
    for(int i = 0; i < list.size(); i++){
        int digit = (Integer)list.get(i);
        for(int j = min; j <= max; j++){
            if(digit==j){
                list.remove(i);
                i--;                
            }
        }
    }
}
