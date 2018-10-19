/*
    a method named findMedian that accepts an array of integers as its parameter and returns 
    the median of the numbers in the array. The median is the number that will appear in the middle 
    if you arrange the elements in order. Assume that the array is of odd size. 

*/

/*
    Loop through all elements in the array, finding the largest value in unsorted array
    and putting it in the end, at the start of a sorted array. 
    
    implementation: For each element I am looping at, loop through subarray from index 0 to array.length - 
    current element, checking if larger value of array[j] exists. If it exists - set max to this value and 
    assign the array index of the biggest element to the variable "index".During each loop (each incrementation) 
    of i, I will add the largest value to the end of unsorted array, which corresponds to array[array.length - i - 1] index.
    during each loop through i var, i will set the element at index 0 to be the max, and check if bigger value exists on length of 
    unsorted array
    
*/


public int findMedian(int[] array){       
        for(int i = 0; i < array.length; i++){
            int max = array[0];
            int index = 0;
            for(int j = 0; j < array.length - i; j++){
                if(array[j]> max){
                    max = array[j];
                    index = j;
                }
            }
            int temp = array[array.length - i - 1];
            array[array.length - i - 1] = max;
            array[index] = temp;
        }
        return array[array.length/2];
}
