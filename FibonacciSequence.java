public class FibonacciSequence extends ConsoleProgram {
    public void run() {
        println("This program lists the Fibonacci sequence.");
        int max = readInt("Max value? ");
        int term = 0;
        int term2 = 1;
        int counter = term + term2;
        print(term+ ", ");
        print(term2+ ", ");
        while (counter <= max - term2){
            print(counter + ", ");
            term = term2;
            term2 = counter;
            counter = term + term2;          
        }
        while (counter <= max){
            print(counter );
            term = term2;
            term2 = counter;
            counter = term + term2;   
         }

    }
}
