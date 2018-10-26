public void mirror(GImage image){
    int[][] pixels = image.getPixelArray();    
    int[][] array4 = new int[pixels.length * 2][pixels[0].length * 2];
    
    for(int i = 0; i < array4.length/2; i++){
        for(int j = 0; j < array4[i].length / 2; j++){
            //same face
            array4[i][j] = pixels[i][j];
            
            //horizontalFlip first column second row
            array4[array4.length - i - 1][j] = array4[i][j];
            //verticalFlip first raw second column
            array4[i][array4[i].length - 1 - j] = pixels[i][j];
              //horizontalFlip second raw second column
            array4[array4.length - i - 1][array4[i].length - 1 - j] = array4[i][array4[i].length - 1 - j];
        }
    }
    image.setPixelArray(array4);
}
