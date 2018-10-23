public boolean isUnique(int[][] array){
    int[] arr = new int[array.length * array[0].length];
    int index = 0;
    for(int i = 0; i < array.length; i++){
        for(int j = 0; j < array[0].length; j++){
            arr[index] = array[i][j];
            index++;
        }
    }
    int unique = countUnique(arr);
    return unique == arr.length;
    
}

public int countUnique(int[] array){
    int count = 0;
    if(array.length > 0){   
        count = 1;
        for(int i = 1; i < array.length; i++){
            int copy = 0;
            for(int j = i - 1; j >= 0; j--){
                if(array[i] == array[j]){
                    copy++;                   
                }
            }
            if (copy == 0){
                count++;
            }
        }        
    }
    return count;
}
