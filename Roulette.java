public class Roulette extends ConsoleProgram {
    public void run() {
        while(money > 0 && money < 1000){
            spin();
        }
        println("max = $" + count);   
    }
    
    
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
    
    private boolean isWin (int random){
        if (random <= 18){
            return true;
        }
        else {
            return false;
        }
    }
    
    private void maxVal() {
        if (money > count){
            count = money;
        }
    }
    
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
       
    private int money = 10;
    private int count = 10;
}
