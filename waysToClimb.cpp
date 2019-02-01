void waysToClimbHelp(int n, Vector<int>& chosen){
    if(n == 0){
        cout << chosen << endl;
    }else if(n > 0){
        // small step
        // choose
        chosen.add(1);
        // explore
        waysToClimbHelp(n - 1, chosen);
        // unchoose
        chosen.removeBack();
        
        // big step
        // choose
        chosen.add(2);
        // explore
        waysToClimbHelp(n - 2, chosen);
        // unchoose
        chosen.removeBack();       
    }
}

void waysToClimb(int n){
    if(n <= 0){
        throw(n);
    }
    Vector<int> chosen;
    waysToClimbHelp(n, chosen);
}



