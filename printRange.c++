void printRange(int x, int y){
    if(y < x){
        throw(y);
    }
    else if(x == y) {
        cout << y;
    }
    else if(x+1 == y){
        cout << x << " -- " << y;
    }
    else{
        cout << x << " > ";
        printRange(x+1, y-1);
        cout <<" < "<< y;
    }
}



