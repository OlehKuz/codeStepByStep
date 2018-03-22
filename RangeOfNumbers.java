public class RangeOfNumbers extends ConsoleProgram {
    public void run(){
        int num1 = readInt("Start? ");
        int num2 = readInt("End? ");
        if (num1<num2){
            for(int i = num1; i < num2; i++){
                print(i + ", ");
            }
            print(num2);
        }
        if (num1>num2){
             for(int i = num1; i > num2; i--){
                print(i + ", ");
            }
            print(num2);
        }
        if(num1 == num2){
            println(num1);
        }
    }
}
