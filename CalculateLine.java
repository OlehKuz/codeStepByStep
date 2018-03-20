public class CalculateLine extends ConsoleProgram {
    public void run() {
        println("This program calculates y coordinates for a line.");
        int slope = readInt("Enter slope (m): ");
        int intercept = readInt("Enter intercept (b): ");
        
        int x = readInt("Enter x: ");
        while(x != -1){
            int result = slope * x + intercept;
            println("f("+x+") = "+result);
            x = readInt("Enter x: ");
        }

    }
}
