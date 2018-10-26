public void flipHorizontal(GImage image){
    int[][] pixels = image.getPixelArray();
    for(int row = 0; row < pixels.length; row++){
        for(int col = 0; col < pixels[row].length / 2; col++){
            int temp = pixels[row][col];
            pixels[row][col] = pixels[row][pixels[row].length - 1 - col];
            pixels[row][pixels[row].length - 1 - col] = temp;            
        }
    }
    image.setPixelArray(pixels);
}
