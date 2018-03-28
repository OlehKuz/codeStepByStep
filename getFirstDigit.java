private int getFirstDigit(int number) {
    int num = Math.abs(number);
    while(num >= 10){
        num /= 10;
    }
    return num;
}
