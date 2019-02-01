void zigzagHelp(int n, bool even){
    if(n < 1){
        throw(n);
    }
    if(n == 1){
        cout << "*";
        if(even) cout << "*";
    }       
    else{
        cout << "<";
        zigzagHelp(n - 1, even);
        cout << ">";
    }
}


void zigzag(int n){
    // if our n is even, we print 2 stars. Pass this info into new function
    bool even = n % 2 == 0;
    if(!even) {
        // divide by 2, because it is easier to print < > using one function call. 
        // Spot that zigzag (7) is identical to zigzag(8), just has one more star. 
        // that is why we add 1 call on odd n, because it has the same pattern as call on n+1. 
        // Just one less star in the middle
        zigzagHelp(n / 2 + 1, even);  
    }
    else{
        zigzagHelp(n / 2, even);  
    }
}



