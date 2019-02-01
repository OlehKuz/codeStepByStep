int sumOfSquares(int n){
    if(n >= 0){
        int sum = n*n;
        if (n > 1){
            sum += sumOfSquares(n-1);
        }
        return sum;
    }
    else {
        throw (n) ;
    }
   
    
} 



