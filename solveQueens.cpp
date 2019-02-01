void solveHelp(Board &b, int col){
    if(col >= b.size()){
        cout << b << endl;
    }
    else{
        for(int i = 0; i < b.size(); i++){
            if(b.isSafe(i, col)){
                b.place(i, col);
                solveHelp(b, col + 1);
                b.remove(i, col);
            }
        }
    }
}

void solveQueens(Board &b){
    solveHelp(b, 0);
}



