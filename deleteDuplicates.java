public void deleteDuplicates(ArrayList list){
    for(int i = 0; i < list.size() - 1; i++){
        if(list.get(i)==list.get(i+1)){
            list.remove(i);
            i--;
        }
    }
}
