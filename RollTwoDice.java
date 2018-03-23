import acm.util.*;
public class RollTwoDice extends ConsoleProgram {
    public void run(){
        int sum = readInt("Desired sum: ");      
        int value = 0;
        /* In a while loop i need to put println statement after digits and values are computed,
           so that if i get value == sum, my values still will be printed in the previous run. 
           If println statement is above those operations, program will check that value == sum, so loop 
           will not run and values wont get printed*/
        while(value != sum){         
            int digit1 = RandomGenerator.getInstance().nextInt(1, 6);
            int digit2 = RandomGenerator.getInstance().nextInt(1, 6);
            value = digit1 + digit2;
            println(digit1 + " and "+ digit2+ " = " + value);
        }
       
    }

} 
