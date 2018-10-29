public void switchPairs(ArrayList list){
    for(int i = 1; i < list.size(); i+=2){
        // i dont get it why i have to convert it to a String
        String prev = (String)list.get(i - 1);
        list.set(i - 1,list.get(i));
        list.set(i,prev);
    }
}
