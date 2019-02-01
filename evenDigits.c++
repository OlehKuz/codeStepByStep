int evenDigitsHelp(int n, int cummulative, int power){
    if(n == 0) return cummulative;
    else{  
        // if digit is even digit - put it in front of digit , that we have accumulated so far
        // I multiply even digit to 10^n power, so that I can add it to the previously accumulated sum , and
        // it appears in front of accumulated digit
        if (n % 2 == 0) {
            int digit = n % 10;
             cummulative = digit * pow(10, power) + cummulative;
            power++;
        } 
        n = n/10;
        return evenDigitsHelp(n, cummulative, power);
    }
}

int evenDigits(int n){
    int even = evenDigitsHelp(abs(n), 0, 0);
    if(n < 0){
        even = - even;
    }
    return even;
}


