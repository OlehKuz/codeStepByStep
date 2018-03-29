/* cant check if it works*/
public class Binary extends ConsoleProgram{
    private int decimalToBinary(int number) {
        int abs = Math.abs(number);    
        int counter = binary(abs);
        last = last(number, counter);
        while (number > last){
            counter = binary(number - last);
            last(number, counter);
            }
        if(number == 0 ){
            last = 0;
        }
        return last;
    }

    
    private int last(int number, int counter){
    int remainder = 1;
        while (number != 0){
            for(int i = 0; i < counter; i++){
                remainder *= 10;
            }
            last += remainder;    
        }
        return last;
    }

    private int binary(int abs){
        int counter = 0;
        while (abs >= 2){
            counter++;
            abs /= 2;        
        }
        return counter;
    }

    private int last = 0;
}
