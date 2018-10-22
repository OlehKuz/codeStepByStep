public void collapsePairs(int[] array){
    int len = array.length;
    if(len % 2 != 0){
        len = len - 1;
    }
    for(int i = 1; i < len; i+=2){
        int sum = array[i] + array[i - 1];
        if(sum % 2 == 0){
            array[i - 1] = sum;
            array[i] = 0;
        }
        else{
            array[i] = sum;
            array[i - 1] = 0;
        }    
    }
}
