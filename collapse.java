/*
    collapse that accepts an array of integers as a parameter and returns a new array 
    where each pair of integers from the original array has been replaced by the sum of that pair.
*/


public int[] collapse(int[] array){
    int length;
    int odd = 1;
    if(array.length % 2 == 0){
        length = array.length/2;
        odd = 0;
    }
    else{
        length = array.length/2 + 1;
    }
    int[] arrayCollapsed = new int[length];
    for(int i = 0; i < arrayCollapsed.length - odd; i++){
        arrayCollapsed[i] = array[2*i]+array[2*i+1]; 
    }
    if(odd==1){
        arrayCollapsed[arrayCollapsed.length - 1] = array[array.length-1];
    }
    return arrayCollapsed;
}
