public int[] split(int[] array){
    int[] splitted = new int[array.length*2];
    for(int i = 0; i < array.length; i++){
        splitted[2*i+1] = array[i]/2;
        splitted[2*i] = array[i] - splitted[2*i+1];
    }
    return splitted;    
}
