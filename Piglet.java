public class Piglet extends ConsoleProgram {
    public void run(){
        println("Welcome to Piglet!");
        int roll = RandomGenerator.getInstance().nextInt(1, 6);
        int accum = roll;
        println("You rolled a " + accum + "!");
        String answer = readLine("Roll again? ");
        
        while(answer.equals("yes")){
            roll = RandomGenerator.getInstance().nextInt(1, 6);
            if(roll == 1){
                println("You rolled a 1!");
                println("You got 0 points.");
                return;
                }
            else if (roll != 1){
                println("You rolled a " + roll+"!");
                accum += roll;
                answer = readLine("Roll again? ");                
                }
            }
        if (answer.equals("no")){
            println("You got " +accum+ " points.");
            }      
    }
}
