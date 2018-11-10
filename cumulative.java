public void cumulative(ArrayList list){
    int cumul = 0;
    for(int i = 0; i < list.size(); i++){
        cumul += (Integer)list.get(i);
        list.set(i, cumul);
    }
}
