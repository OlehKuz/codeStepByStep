private int countDigits(int integer){
    int count = 0;
    int abs = Math.abs(integer);
    while(abs > 0){
        abs /= 10;
        count++;
    }
    return count;
}
