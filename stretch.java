public void stretch(GImage image, int scale){
    int[][] pixels = image.getPixelArray();
    int[][] stretched = new int[pixels.length][pixels[0].length * scale];
    for(int row = 0; row < stretched.length; row++){
        for(int col = 0; col < stretched[0].length; col++){
            stretched[row][col] = pixels[row][col/scale];
        }
    }
    image.setPixelArray(stretched);
}
