private void fitnessGoal(int goal){
    int count = 0;
    int prevTrain = 0;
    int days = 0;
    printf("Train until you increase for %d days.\n", goal);
    while (count < goal){
        int min = readInt("Minutes? ");
        if(min > prevTrain){
            count++;
            println("Great job!");
        }
        else{
            count = 0;
            println("Start over.");
        }
        prevTrain = min;
        days++;
    }
    printf("Reached your goal in %d total days!\n", days);
}
