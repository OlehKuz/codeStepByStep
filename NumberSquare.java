public class NumberSquare extends ConsoleProgram {
    public void run(){
        int min = readInt("Min? ");
        int max = readInt("Max? ");
        for(int i = 0; i <= max - min; i++){
            for(int j = min + i; j <= max; j++){
                print(j);
            }
            for(int k = min; k < min + i; k++){
                print(k);
            }
            println();
        }
    }
}

