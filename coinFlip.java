private void coinFlip(int flips, char side){
    if(flips < 0 || (side != 'T' && side != 'H')){
        println("ERROR!");
        return;
    }
    int counter = 0;
    int sd;
    char otherSide; 
    if(side == 'T'){
        sd = 1;
        otherSide = 'H';
    }
    else {
        sd = 0;
        otherSide = 'T';
    }
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
