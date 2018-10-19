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
                for(int k = i; k < a1.length - counter; k++){
                    a1[k]=a1[k+1];                    
                }
                i--;
                a1[a1.length - counter] = 0;
                break;
            }
        }
    }
}
