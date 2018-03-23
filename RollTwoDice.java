import acm.util.*;
public class RollTwoDice extends ConsoleProgram {
    public void run(){
        int sum = readInt("Desired sum: ");      
        int value = 0;
        while(value != sum){         
            int digit1 = RandomGenerator.getInstance().nextInt(1, 6);
            int digit2 = RandomGenerator.getInstance().nextInt(1, 6);
            value = digit1 + digit2;
            println(digit1 + " and "+ digit2+ " = " + value);
        }
       
    }

} 
