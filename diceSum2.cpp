void diceSumHelp(int n, int sum, Vector<int>& soFar, int min){
    if(n < 0 || sum < 0){

    }
    else if(sum == 0 && n == 0){
        cout <<soFar<< endl;
       }else{
        for(int i = min; i <= 6; i++){
                //int diceLeft = n-1;
                soFar.add(i);
                //int lessSum = sum - i;
                diceSumHelp(n-1, sum - i, soFar, i);
                soFar.remove(soFar.size()-1);

        }
    }
}


void diceSum2(int nDice, int sum){
    Vector<int> v;
    int min = 1;
    diceSumHelp(nDice,sum, v, min);
}










