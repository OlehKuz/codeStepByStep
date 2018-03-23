private void triangle (int size) {
    for (int i = 0; i < size; i++){
        for(int j = 0; j < size - 1 - i; j++){
            print(" ");
        }
        for(int k = 0; k < 1 + i; k++){
            print("*");
        }
        println();
    }
}
