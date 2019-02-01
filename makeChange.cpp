void changeHelp(int change,const Vector<int>& coins, Vector<int> &chosen, int index){
    if(change == 0){
        cout << chosen << endl;
    }    
    else{       
            for(int i = index; i < coins.size(); i++){
                if(change - coins[i] >= 0){
                    //choose + explore w coin
                    chosen[i]++;
                    changeHelp(change - coins[i], coins, chosen, i);
                    chosen[i]--;
            }
        }
    }
}

void makeChange(int change, Vector<int > & coins ){
    int len = coins.size();
    Vector<int> chosen(len);
    changeHelp(change,coins, chosen, 0);
}



