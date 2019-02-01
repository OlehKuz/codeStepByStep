void printAllBinaryHelp(int n, string s){
    if(n < 0){ 
    
    }
    else if(n == 0){
        cout << s << endl;
    }else{
        printAllBinaryHelp(n - 1, s + "0" );
        printAllBinaryHelp(n - 1, s + "1" );
    }
}

void printAllBinary(int n){
    printAllBinaryHelp(n, "");
}



