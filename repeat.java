public void repeat(ArrayList list, int k){
    if(k < 1){
        list.clear();
    }
    else{
        for(int i = 0; i < list.size(); i+=k){           
            for(int j = 0; j < k - 1; j++){
                list.add(i + j,list.get(i));
            }
        }
    }
}
