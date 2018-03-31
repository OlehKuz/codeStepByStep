/* "Random walk" algorithm where an integer value is repeatedly increased or 
decreased by 1 randomly many times until it hits some threshold. Your method should accept the 
integer threshold as a parameter, then start an integer at 0 and adjust it by +1 or -1 repeatedly
until its value reaches positive or negative threshold. */

private void randomWalk(int treshold){
    int position = 0;
    int counter = 0;
    int step;
    int max = 0;
    while(Math.abs(position) != treshold){
        int stepRand = RandomGenerator.getInstance().nextInt(0, 1);
        if(stepRand == 0){
            step = -1;
            position+=step;
        }
        else{
            step = 1;
            position+=step;
        }
        if(max < position){
            max = position;
        } 
        printf("Position = %d\n", position);
        counter++;
    }
    printf("Finished after %d step(s)\n", counter);
    printf("Max position = %d\n", max);
}
