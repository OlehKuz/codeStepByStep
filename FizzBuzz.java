/* Difference between "if" and "else if" statements: if your 
 condition is satisfied one time, then "else if" statements will not be executed during the same run, 
 even if my number satisfies the condition of "else if" statement. On the contrary , all if statements that are satisfied 
 will be executed during the same run . So if instead of "else if" i use "if" statement my program will print 'FizzBuzz'
 and then also 'Fizz', which is not what i want to */
public class FizzBuzz extends ConsoleProgram {
    public void run() {
        int value = readInt("Max value? ");
        for(int j = 1; j <= value; j++){
            if(j % 3 == 0 && j % 5 == 0){
                print("FizzBuzz ");
            }
            else if(j % 3 == 0){
                print("Fizz ");
            }
            else if(j % 5 == 0){
                print("Buzz ");
            }
            if(j % 20 == 0){
                println();
            }
            else if(j % 3 != 0 && j % 5 != 0){
                print(j + " ");
            }
        }
    
    }
}
