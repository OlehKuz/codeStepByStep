public class SentinelSum extends ConsoleProgram{
    public void run(){
        int number = readInt("Type a number: ");
        int sum = 0;
        while(number != -1){
            sum += number;
            number = readInt("Type a number: ");           
        }
        println("Sum is " + sum);
    }
}
