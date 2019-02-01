int digitSum(int p){
    int sum = 0;
    if(p == 0){
        
    }
    else if(p < 0){
        sum = -digitSum(-p);
    }
    else {
        sum = p % 10;
        sum += digitSum(p / 10);
    }
    return sum;
    
}
