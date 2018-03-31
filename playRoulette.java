/* Method accepts two parameters: an integer for the dollars the player starts with; and another integer for 
the dollars the player will bet each round.

The player bets that the ball will land on any even number. If the ball lands on an even number,
the player wins; and if the ball lands on any odd number or 0, the player loses. */

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
