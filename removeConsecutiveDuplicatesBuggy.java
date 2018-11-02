public void removeConsecutiveDuplicates(ArrayList inList){
    for(int i = 0; i < inList.size() - 1;i++){
        if((Integer)inList.get(i)==(Integer)inList.get(i+1)){
            inList.remove(inList.get(i));
            i--;
        }
        
    }
}
