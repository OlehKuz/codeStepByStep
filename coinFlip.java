/* IMPORTANT! 
If I use else if(side == 'T') statement instead of else statement code will not 
compile and i get an error variable sd, otherSide might not have been initialized.
Fix would be to (1) use if else on all the branches, and (2) make the last one an else without another if,
 i.e. else { ... instead of else if (num > 4) { ...  Or best just write int sd = (side == 'T') ? 1 : 0;

*/

private void coinFlip(int flips, char side){
    if(flips < 0 || (side != 'T' && side != 'H')){
        println("ERROR!");
        return;
    }
    /*int counter = 0;    // better solution is w ternary operator 
    int sd;
    char otherSide; 
    if(side == 'T'){
        sd = 1;
        otherSide = 'H';
    }
    else {
        sd = 0;
        otherSide = 'T';
    }*/
 
    int counter = 0;
    int sd = (side == 'T') ? 1 : 0;
    char otherSide = (side == 'T') ? 'H' : 'T';
 
    while(counter != flips){
        int flip = RandomGenerator.getInstance().nextInt(0, 1);
        if(sd == flip){
            counter++;
            printf("%c ", side);
        }
        else{
            counter = 0;
            printf("%c ", otherSide);
        }
    }
    println();
    printf("You got %c %d times in a row!\n", side, flips);
    return;
}
