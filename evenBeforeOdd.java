/*
   Write a method named evenBeforeOdd that accepts an array of integers as a parameter and rearranges 
   its elements so that all even values appear before all odds. 
   
    Do not make any assumptions about the length of the array or the range of values it might contain. 
    For example, the array might contain no even elements or no odd elements.

    You should not use any temporary arrays to help you solve this problem. 
    (But you may declare as many simple variables as you like, such as ints.) You may not use any other data 
    structures such as Strings orArrayLists. You should not use Arrays.sort in your solution.
    
    if i dont add static in header, i get an error "non-static method evenBeforeOdd(int[]) 
    cannot be referenced from a static context"
*/

public static void evenBeforeOdd(int[] array){
        for(int i = array.length - 1; i >= 0; i--){
            if(array[i] % 2 == 0){
                int temp = array[i];
                for(int j = 0; j < i; j++){
                    if(array[j] % 2 != 0){
                        int temp1 = array[j];
                        array[j] = temp;
                        array[i] = temp1;
                        break;
                    }
                }
            }
        }   
}
