private int decimalToBinary(int decimal) {
    // the remainder while dividing a decimal # into 2 will represent some power of 10. 
    //the starting power of 10 will be 0
    int power = 0;
    int binary = 0;
    int remainder;
    while(decimal > 0){
        remainder = decimal % 2;
        decimal /= 2;
        if(remainder != 0){
            binary += Math.pow(10, power);
        }
        power++;
    }
    return binary;    
}
