/*  Take current element from an array, look through the next values of an array.
    If element at any next index matches the value of current element - increase counter;loop over 
    all indexes up to the array.length;
    If there are more than one dublicate value, counter will be > 1; if counter is >=1, which 
    means that there are dublicates , increment dublicate.
    
    [1, 4, 2, 4, 7, 1, 1, 9, 2, 3, 4, 1] counting array[0] dublicates our counter will be 3 the first time,
    which is what an answer should be, but because we will be looping over array incrementing indexes one at a time, 
    we will be counting duplicate values a couple of times. we will have 2 dublicates of array[5], but actually those
    will be the same values already counted as array[0] dublicates. of actual k dublicates we will count  !k dublicates.
    So we need to increment dublicates by 1 if counter is >=1, to avoid the situation of overcounting dublicates described before.
    */

public int countDuplicates(int[] array){
    int dublicate = 0;
    if(array.length > 1){
        for(int i = 0; i < array.length; i++){
            int current = array[i];
            int counter = 0;
            for(int j = i + 1; j < array.length; j++){
                if(current == array[j]){
                    counter++;
                }
            }
            if(counter >=1){
                dublicate ++;
            }
        }
    }
    return dublicate;
}
