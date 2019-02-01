void sequence(int k){
    if(k < 1){
        throw(k);
    }
    if(k == 1) cout << k;
    else if(k % 2 == 0){
        cout << "("<< k << " + ";
        sequence(k-1);
        cout << ")";
    }
    else {
        cout << "(";
        sequence(k-1);
        cout <<" + "<< k  << ")"; 
    }
}



