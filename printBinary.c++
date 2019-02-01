void printBinary(int n){
    // base case
    if(n == 0 || n == 1){
        cout << n;
    }
    else if(n < 0){
        cout << '-';
        printBinary(-n);
    }
    else {
        // the same as in decimal. We take out last number by dividing original # by base 2 (in decimal by base 10),
        // do sth w it, and in order to get the number that is left over, we 
        // divide our original number by base (2 in binary, 10 in decimal)
        int last = n % 2;
        printBinary(n/2);
        // print previos digit, then print me
        cout << last;
    }
}



