/*  A method named hasMirrorTwice that accepts two arrays of integers a1 and a2 
    as parameters and returns true if a1 contains all the elements of a2 in reverse 
    order at least twice (and false otherwise). For example, if a2 stores the elements {1, 2, 3} 
    and a1 stores the elements {6, 3, 2, 1, 4, 1, 3, 2, 1, 5}, your method would return true.

    Assume that both arrays passed to your method will have a length of at least 1. 
    The two occurrences of the mirror might overlap, as shown in the fourth sample call below.
    Do not modify the contents of the arrays passed to your method as parameters.
*/


public boolean hasMirrorTwice(int[] a1, int[] a2){
    int repeats = 0;
    for(int i = 0; i < a1.length - a2.length + 1; i++){
        int counter = 0;
        /*  loop through a1 in chunks of array 2 size, incrementing by 1 in i loop to shift 
        our "scanner" over the size of a1 array,compare each value of a1 in this chunk to the reversed array a2, 
        if there are as many matches as a2.length, that means that both the chunk and a2, are the same, in that case increment our 
        repeats var.   j - i  at its maximum equals to a2.length - 1.  That is why in a check we need to write a2[a2.length - 1 - (j - i)], 
        and not a2[a2.length - (j - i)], because when j = i = 0, we have a2[a2.length] which gives ArrayOutOfBounds error
        
        */
        for(int j = i; j < i + a2.length; j++){
            if(a1[j]==a2[a2.length - 1 - (j - i)]){
                counter++;
            }
        }
        if(counter == a2.length){
            repeats++;
        }
    }
    if(repeats >=2){
        return true;
    }
    return false;
}
