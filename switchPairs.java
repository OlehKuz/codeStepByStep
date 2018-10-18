public void switchPairs(String[] array){
    String temp;
    for(int i = 1; i < array.length; i+=2){
        temp = array[i - 1];
        array[i - 1] = array[i];
        array[i] = temp;
    }
}
