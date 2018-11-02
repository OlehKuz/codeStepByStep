public void removeBadPairs(ArrayList inList){
    for(int i = 0; i < inList.size(); i+=2){
        if(i + 1 < inList.size()){
            if((Integer)inList.get(i)>(Integer)inList.get(i+1)){
                inList.remove(i+1);
                inList.remove(i);
                i-=2;
            }
        }
        else{
            inList.remove(i);
        }    
    }
    
}
