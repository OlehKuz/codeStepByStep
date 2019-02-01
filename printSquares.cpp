void printVector(const Vector<int>& v){
    if(!v.isEmpty()){
        for(int i = 0; i < v.size() - 1; i++){
            cout << v[i] << "^2 + ";
        }
        cout << v[v.size() - 1] << "^2" << endl;
    }
}

void printSquaresHelp(int n, Vector<int>& v, int root){
    if(n < 0){
        throw(n);
    }
    else if(n == 0){
        printVector(v);
    }    
    else if (n > 0){       
            for(int i = root; i <= sqrt(n); i++){
                v.add(i);
                printSquaresHelp(n - pow(i, 2), v, root += 1);
                v.removeBack();
            }
        
    }
}

void printSquares(int n){
    Vector<int> v;
    printSquaresHelp(n, v, 1);
}







