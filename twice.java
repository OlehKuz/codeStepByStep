public void twice(ArrayList list){
    int len = list.size();
    for(int i = 0; i < len; i++){
        list.add(list.get(i));
    }
}
