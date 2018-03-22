public class ComputeSumOfDigits extends ConsoleProgram {
    public void run() {
        int num = readInt("Type an integer: ");
        String s = new Integer(num).toString();
        int len = s.length();
        for(int i = 1; i <= len; i++){
            print(i);
        }
    }
}
