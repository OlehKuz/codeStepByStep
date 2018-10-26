public void wideFlip(GImage image){
    int[][] pixels = image.getPixelArray();
    int[][] flippedStretched = new int[pixels.length][pixels[0].length * 2];
    for(int i = 0; i < flippedStretched.length; i++){
        for(int j = 0; j < flippedStretched[i].length; j++){
            flippedStretched[i][j] = pixels[flippedStretched.length - 1 - i][j/2];
        }
    }
    image.setPixelArray(flippedStretched);   
}
