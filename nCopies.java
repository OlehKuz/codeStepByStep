/*
  returns a new array a2, with each element value n replaced by n consecutive copies of the
  value n at the same relative location in the array.Any element whose value is 0 or negative
  should not be kept in the returned array
*/

public int[] nCopies(int[] array){
// count length of a newArray. 
   int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > 0) {
                count += array[i];            
            } 
        }
   int newArray[] = new int[count];
   int startIndex = 0;
         for(int i = 0; i < array.length; i++){
            if(array[i] > 0) {
                    for(int k = startIndex; k < startIndex + array[i]; k++){
                        newArray[k] = array[i];
                    }
                    // remembers at which index starts empty array. Add array[i], because we added this many new values to the array
                    startIndex = startIndex + array[i]; 
                }
            }
    return newArray;
} 
