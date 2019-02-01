void countHelp(int n, int m, string& s){
    if(n < 1){
        throw(n);
    }
    if(m < 1){
        throw(m);
    }
    if(n - m >= 1) {
        s = integerToString(n-m) + ", " + s;
        countHelp(n - m, m, s);         
        }    
}


void countToBy(int n, int m){ 
    string s = integerToString(n);
    countHelp(n, m, s);
    cout << s << endl;
}



