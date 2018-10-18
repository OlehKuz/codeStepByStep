public int longestSortedSequence(int[] array){
    int sequence = 0;
    if(array.length > 0){
        sequence = 1;
        int counter = 1;
        for(int i = 1; i < array.length; i++){        
            if(array[i] >= array[i-1]){
                counter++;
                if(counter > sequence){
                    sequence = counter;
                }
            }            
            else{
                counter = 1;
            }
        }
        
    }
    return sequence;
}
