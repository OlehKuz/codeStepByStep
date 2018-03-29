private void randomOver(int n, int max){
    int print = RandomGenerator.getInstance().nextInt(0, max);
        printf("Random number: %d\n", print);
    while(print < n){
        print = RandomGenerator.getInstance().nextInt(0, max);
        printf("Random number: %d\n", print);
    }
}
