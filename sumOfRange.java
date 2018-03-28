private int sumOfRange (int min, int max) {
    int counter = 0;
    if(max >= min){
        for (int i = min; i <= max; i++){
        counter+=i;
        }
    }
    return counter;
}
