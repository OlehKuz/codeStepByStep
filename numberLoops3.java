for(int k = 1; k <= 5; k++){
    for(int i = k; i < 5; i++){
        print(".");
    }
    print(k);
    for(int l = k; l > 1; l--){
        print(".");
    }
    println();
}


// or this way

public class NumberLoops4 extends ConsoleProgram {
    public static final int SIZE = 7;
    public void run() {
        for (int i = 1; i <= SIZE; i++) {
            for (int j = 1; j <= SIZE - i; j++) {
                print(".");
            }
            print(i);
            for (int j = 1; j <= i - 1; j++) {
                print(".");
            }
            println();
        }
    }
}
