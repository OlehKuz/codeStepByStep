public class BiggestAndSmallest extends ConsoleProgram{
    public void run() {
        int count = readInt("Number of numbers? ");
        int num = readInt("Number 1: ");
        int biggest = num;
        int smallest = num;
        
        for(int i = 2; i <= count; i++){
            num = readInt("Number "+ i + ": ");
            if(num > biggest){
                biggest = num;
            }
            if(num<smallest){
                smallest = num;
            }
        }
        println("Biggest = " + biggest);
        println("Smallest = " + smallest);
    }
}
