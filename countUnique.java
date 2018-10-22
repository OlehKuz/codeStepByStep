/*
    The outer loop picks an element one by one starting from the leftmost element. 
    The inner loop checks if the element is present on left side of it. If present, 
    then ignores the element, else increments the counter variable .

*/

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
