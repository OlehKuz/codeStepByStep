/* Roulette that simulates the gambling game.The player begins with $10 and bets (up to) $3 per spin of the wheel. 
If the wheel comes up 1-18, the player wins $3. Otherwise, player loses $3.
Play until the player gets $1000 or drops to $0. At the end, print the max money the player ever earned.*/
public class Roulette extends ConsoleProgram {
    public void run() {
        while(money > 0 && money < 1000){
            spin();
        }
        println("max = $" + count);   
    }
    
    /* Generates a random number and decides how much money we have left, based on the bet we placed .
    Calls maxVal method to check the max amount of money we have during the game*/ 
    
    private void spin(){
        int bet = bet();
        int random = random();
        if(isWin(random)){
            money+=bet;
        }
        else if(!isWin(random)){
            money-=bet;
        }
        printf("bet $%d, spin %d, money = $%d\n", bet, random, money);
        maxVal();        
    }
    // was our gamble a win or lose
    private boolean isWin (int random){
        if (random <= 18){
            return true;
        }
        else {
            return false;
        }
    }
    // counts max amount of money we had during all of our gambles in the game
    private void maxVal() {
        if (money > count){
            count = money;
        }
    }
    // while we have enough money to bet 3$ - bet 3$, otherwise bet what we have
    private int bet(){
        int bet = 3;
        if (bet > money){
            bet = money;
        }
        return bet;
    }
    
    private int random(){
        int rdm = RandomGenerator.getInstance().nextInt(1, 36);
        return rdm;
    }
    // private variable that are accessed and modified by each method that calls them   
    private int money = 10;
    private int count = 10;
}
