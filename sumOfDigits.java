private int sumOfDigits(int number) {
    int abs = Math.abs(number);
    int counter = 0;
    while (abs > 0){
        int lstDigit = abs % 10;
        counter += lstDigit;
        abs /= 10;        
    }
    return counter;
}
