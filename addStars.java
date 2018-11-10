public void addStars(ArrayList list){
    int len = list.size();
    for(int i = 0; i <= len; i+=2){
        list.add(i, "*");
        len++;
    }
}
