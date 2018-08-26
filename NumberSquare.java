public class NumberSquare extends ConsoleProgram {
    public void run(){
        int min = readInt("Min? ");
        int max = readInt("Max? ");
        for(int i = min; i <= max; i++){
            for(int j = i; j <= max; j++){
                print(j);
            }
            for(int k = min; k < i; k++){
                print(k);
            }
            println();
        }
    }
}
