private boolean isPrimeNumber(int number){
     if(number >= 0){
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                return false;
            }  
        }
        if(number == 0 || number == 1){
            return false;
        }
    }
    if(number < 0){
        return false;
    }
    return true;
}
