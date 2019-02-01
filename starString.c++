string starString(int n){
    if(n < 0) throw(n);
    else if(n == 0){
        return "*";
    }

    else {
        // each next call after starString(0) has double the number of stars as previos call.
        // double the number of strings and pass it back to previos stack call
        string s = "";
        s = starString(n-1);
        s+=s;
        return s;
    }    
}

