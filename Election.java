public class Election extends ConsoleProgram {
    public void run(){
        try{
            String file = readLine("Input file? ");
            Scanner input = new Scanner(new File(file));
            int c1Total = 0;
            int c2Total = 0;
            while(input.hasNextLine()){
                String line = input.nextLine();
                Scanner readLine = new Scanner(line);
                String state = readLine.next();
                int c1 = readLine.nextInt();
                int c2 = readLine.nextInt();
                int evotes = readLine.nextInt();
                if (c1 > c2){
                    c1Total += evotes;
                }
                if (c2 > c1){
                    c2Total += evotes;
                }
            }
            printf("Candidate 1: %d votes\n", c1Total);
            printf("Candidate 2: %d votes\n", c2Total);
        }
        catch (FileNotFoundException ex) {
        println("File not found! ");
        }
    }
}

