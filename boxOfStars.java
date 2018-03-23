private void boxOfStars (int width, int height) {
    for (int i = 0; i < width; i++) {
        print("*");
    }
    println();
    for(int j = 0; j < height - 2; j++){
        print("*");
        for(int k = 0; k < width - 2; k++){
            print(" ");
        }
        println("*");
    }
    for (int i = 0; i < width; i++) {
        print("*");
    }
    println();
}
