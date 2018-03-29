private int binaryToDecimal(int binary) {
    int power = 0;
    int decimal = 0;
    int remainder;
    while(binary > 0){
        remainder = binary % 10;
        binary /= 10;
        if(remainder != 0){
            decimal += Math.pow(2, power);
        }
        power++;
    }
    return decimal;     
}
