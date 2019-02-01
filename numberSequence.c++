void sequenceHelp(int n, bool even){
    if(n < 1){
        throw(n);
    }
    if(n == 1){
        cout << n << " ";
        if(even) cout << n << " ";
    }       
    else{
        cout << n << " ";
        sequenceHelp(n - 1, even);
        cout << n << " ";
    }
}


void numberSequence(int n){
    bool even = n % 2 == 0;
    if(!even) {
        sequenceHelp(n / 2 + 1, even);  
    }
    else{
        sequenceHelp(n / 2, even);  
    }
}



