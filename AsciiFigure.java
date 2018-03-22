public class AsciiFigure extends ConsoleProgram {
    public static final int SIZE = 5;
    public void run() {
        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < SIZE - 1-i; j++){
                print("////");
            }
            for(int k = 0; k < i * 2; k++){
                print("****");
            }
            for(int l = 0; l < SIZE - 1-i; l++){
                print("\\\\");
            }
            println();          
        }        
    }
}
