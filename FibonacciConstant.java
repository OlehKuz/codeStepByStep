public class Fibonacci extends ConsoleProgram {
    private static final int MAX_TERM_VALUE = 100;
    public void run() {
        println("This program lists the Fibonacci sequence.");
        int term = 0;
        int term2 = 1;
        int counter = term + term2;
        println(term);
        println(term2);
        while (counter < MAX_TERM_VALUE){
            println(counter);
            term = term2;
            term2 = counter;
            counter = term + term2;          
        }
    }
}
