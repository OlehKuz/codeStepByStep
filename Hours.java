/*
Write a console program in a class named Hours that prompts for the name of, and then reads, a file of data about 
the number of hours worked by several employees. Each line begins  with the employee's ID number,
followed by their name, then a sequence of real numbers representing  how many hours they worked each day.

You may assume that the user types the name of a file that exists and is readable, and that the data is in the valid format shown above. 
*/

public class Hours extends ConsoleProgram {
    public void run() {
        try{
            String file = readLine("Input file? ");
            Scanner input = new Scanner(new File(file));
            while(input.hasNextLine()){
                String line = input.nextLine();
                Scanner readLine = new Scanner(line);
                int id = readLine.nextInt();
                String name = readLine.next();
                double hours = 0;
                int days = 0;    
                while (readLine.hasNextDouble()) {
                    hours += readLine.nextDouble();
                    days++;
                }
                double aver = hours/days;
                printf("%s (ID#%d) worked %.1f hours (%.1f/day)\n", name, id, hours, aver);

            }
        }catch(FileNotFoundException ex){
            println("File not found !");
        }
    }
    
}
