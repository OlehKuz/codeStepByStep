void diceSumHelp(int n, int sum, Vector<int>& soFar){
    if(n <= 0){
    
    }if(sum == 0){
        cout <<soFar<< endl;
    }else{
        for(int i = 1; i <= 6; i++){
            int min = i + (n-1);
            int max = i + 6*(n-1);
            if(min <= sum && max >= sum){
                soFar.add(i);
                diceSumHelp(n-1, sum - i, soFar);
                soFar.remove(soFar.size()-1);
            }
        }
    }
}

void diceSum(int nDice, int sum){
    Vector<int> v;
    diceSumHelp(nDice,sum, v);
}






