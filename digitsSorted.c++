bool digitsSorted(int n){
    if(n/10 == 0){
        return true;
    }
    else if(n < 0){
        return digitsSorted(-n);
    }
    else{
        int lastDigit = n % 10;
        n = n / 10;
        if(n % 10 > lastDigit){
            return false;
        }
    }
    return digitsSorted(n);
}

