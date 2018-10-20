//print a list of prime numbers between 2 and a given maximum. You will represent the numbers using an array.

public class Sieve extends ConsoleProgram {
    
    public void run(){
        int length = readInt("Max value N? ");
        //  [length - 1], to fit numbers 2...length
        int[] array = new int[length - 1];
        initializeArray(array);     
            /*  counter var saves at which index we need to cut printing our prime numbers,
                it says how many '0' are in the end of an array*/
        int counter = leavePrime(array);
        printArray(array, counter);
    }
    
    // Initialize an array w number sequence from 2 to N in increasing order
    public void initializeArray(int[] a){
        for(int i = 0; i < a.length; i++){
            a[i] = i+2;
        }      
    }
    
    // prints prime numbers in an array
    public void printArray(int[] a, int counter){
        print("Primes: ");
        for(int i = 0; i < a.length - counter; i++){
            print(a[i] + " ");
        }      
    }
    
    // leaves only prime numbers in an array, converting other values to 0 and sending them to the end of an array
    public int leavePrime(int[] a1){  
        // counts numbers that are not prime
        int counter = 0;
        for(int i = 0; i < a1.length; i++){
            // take one value at index i and check if there are multiples of that value
                    for(int k = i + 1; k < a1.length - counter; k++){
                        if(a1[k] % a1[i] == 0){
                            counter++;
                            /* shift unchecked numbers one index to the left                           
                            */
                            for(int j = k; j < a1.length - counter; j++){
                                a1[j]=a1[j+1];                    
                            }
                            /*  assign 0 value in the index immediately after 
                                nonzero values, to the end of an aray. in place of number that was not prime*/ 
                            /*  i-- repeat the loop at previous index, to check if the value shifted in place 
                                of non prime number is a prime number
                            */
                            i--;
                            a1[a1.length - counter] = 0;
                            break;
                            
                        }                 
                    }          
                }
            return counter;
        }    
}
