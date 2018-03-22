public class ComputeSumOfDigits extends ConsoleProgram {
    public void run() {
        int num = readInt("Type an integer: ");
        String s = new Integer(num).toString();
        int len = s.length();
        int accum = num % 10; 
        for(int i = 1; i <= len - 1; i++){
            num = num / 10;
            accum += num % 10;
        }
        println("Digit sum is " + accum);
    }
}
