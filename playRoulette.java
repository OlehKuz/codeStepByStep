/* Roulette that simulates the gambling game.The player begins with $10 and bets (up to) $3 per spin of the wheel. 
If the wheel comes up 1-18, the player wins $3. Otherwise, player loses $3.
Play until the player gets $1000 or drops to $0. At the end, print the max money the player ever earned.*/

    public void playRoulette(int start, int bet) {
        printf("start with $%d, betting up to $%d\n", start, bet);
        printf("bet\tspin\tmoney\n");
        
        /* since the value of bet var changes to money left , if we have less money left than amount of initial bet, 
        we need additional initialBet var that will set bet value back to its starting value when money left 
        will be enough to make initial bet
        */
        int initialBet = bet;
        int count = start;
        while (start > 0){          
            if (initialBet > start){
                bet = start;
            }
            else {
                bet = initialBet;
            }
            int rdm = RandomGenerator.getInstance().nextInt(0, 36);
            if (rdm == 0 || rdm % 2 != 0){
                start -= bet;
            }
            else {
                start+=bet;
            }                      
            if (start > count){
                count = start;
            }
            printf("$%d\t%d\t$%d\n", bet, rdm, start);         
        }
        println("max money: $" + count);
        return;
    }
