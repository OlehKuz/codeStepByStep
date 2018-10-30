public class Histogram extends ConsoleProgram{
    public void run(){
        readList();
        printHistogram();

    }
    
     private void readList() {
        try{
            String file = readLine("File: ");
            Scanner input = new Scanner (new File (file));
            while (input.hasNextInt()){                
                int score = input.nextInt();
                scores[score]++;                
            }
        }
        catch(FileNotFoundException ex){        
        }
    }
    
    private void printHistogram(){
        for(int i = 0; i < 101 - range; i+=range){
            int sum = 0;
            for(int j = 0; j < range; j++){
                sum += scores[i + j];
            }
            int endRange = i+range-1;
            printf("%d-%d: ", i, endRange);
            for(int k = 0; k < sum; k++){
                print("*");
            }
            println();
        }
         printf("  100: ");
         for(int k = 0; k < scores[scores.length - 1]; k++){
             print("*");
         }
    }
    private int[] scores = new int[101];
    private static final int range = 10;
}
