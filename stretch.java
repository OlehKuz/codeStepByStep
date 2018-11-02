public void stretch(ArrayList array){
    for(int i = 0; i < array.size(); i+=2){
        int last = (Integer)array.get(i) / 2;
        int first = (Integer)array.get(i) - last;
        array.set(i, first);
        array.add(i + 1, last);        
    }
}
