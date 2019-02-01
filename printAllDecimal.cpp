void printAllDecimalHelp(int n, string s){
    if(n < 0){ 
    
    }
    else if(n == 0){
        cout << s << endl;
    }else{
        for(int i = 0; i <= 9; i++){
            printAllDecimalHelp(n - 1, s + integerToString(i) );
        }
    }
}

void printAllDecimal(int n){
    printAllDecimalHelp(n, "");
}



