public void mirror(ArrayList list){
    int len = list.size();
    for(int i = len - 1; i >= 0; i--){
        list.add(list.get(i));
    }
}
