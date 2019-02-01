void diceHelp(int n, Vector<int>& soFar){
    if(n < 0){
    
    }else if(n == 0){
        cout <<soFar<< endl;
    }else{
        for(int i = 1; i <= 6; i++){
            soFar.add(i);
            diceHelp(n-1, soFar);
            soFar.remove(soFar.size()-1);
        }
    }
}

void diceRolls(int n){
    Vector<int> v;
    diceHelp(n, v);
}



