public void removeEvenLength(ArrayList array){
    for(int i = 0; i < array.size(); i++){
        String word = (String)array.get(i);
        if(word.length() % 2 == 0){
            array.remove(i);
            // if we remove value at that index, we need to check the value that got shifted at that index
            i--;
        }
    }
}
