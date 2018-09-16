private void inputStats (String file){
    int characters = 0;
    int lines = 0;
    int sum = 0;
    double average = 0.0;
    try{
        Scanner input = new Scanner (new File(file)); 
        while(input.hasNextLine()){
            String s = input.nextLine();
            lines++;
            int i = s.length();
            sum += i;
            if (i > characters){
                characters = i;
            }
            printf("Line %d has %d chars\n", lines, i);
        }
        average = (double) sum / lines;
        printf("%d lines; longest = %d, average = %.1f\n", lines, characters, average);
    }
    catch(FileNotFoundException ex){
    }
}
