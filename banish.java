/*
    a method named banish that accepts two arrays of integers a1 and a2 as parameters and
    removes all occurrences of a2's values from a1. An element is "removed" by shifting all 
    subsequent elements one index to the left to cover it up, placing a 0 into the last index. 
    The original relative ordering of a1's elements should be retained.
    
    You may assume that the arrays passed are not null. You may assume that the values stored in a2 
    are unique and that a2 does not contain the value 0.

    You may not use any temporary arrays to help you solve this problem. (But you may declare as many 
    simple variables as you like, such as ints.) You also may not use any other data structures or 
    complex types such as Strings, or other data structures such as the ArrayList class


*/


public void banish(int[] a1, int[] a2){   
    int counter = 0;
    for(int i = 0; i < a1.length; i++){
        for(int j = 0; j < a2.length;j++){
            if(a1[i]==a2[j]){
                counter++;
                // counter var helps us to keep track at which index the last non-zero element should be 
                for(int k = i; k < a1.length - counter; k++){
                    a1[k]=a1[k+1];                    
                }
                /* i-- ensures that if the next value we shifted in place of previous value in array a1 has the same value
                as element from a2 array, we will remove it. if we dont have i-- we will not check the current index and any value
                at that index  will be passed as ligid*/
                i--;
                a1[a1.length - counter] = 0;
                break;
                /* break statement ensures that after finding the first value that matches a1[i]==a2[j],
                we will not execute the outermost loop for(int j = 0; j < a2.length;j++){...}   once again.
                This must be the case, because if we have a match a1[i]==a2[j] when i = 0, then i-- operator will change 
                i to -1, and checking that condition will throw ArrayIndexOutOFBounds exception. We dont need to check that 
                condition anyways, because if that number == a2[j], it cant be equal to any other number.
                */
            }
        }
    }
}
