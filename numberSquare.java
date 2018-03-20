public void numberSquare (int min, int max){
    int count = max - min;
    for (int i = 0; i <= count; i++){
        for(int j = min + i ; j <= max; j++){
            print(j);
        }
        for (int k = min; k < min + i; k++){
            print(k);
        }
        println();
    
    }
    
}
