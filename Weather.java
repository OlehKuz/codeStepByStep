/*
Input file? weather.txt 
16.2 to 23.2, change = 7.0
23.2 to 19.2, change = -4.0
19.2 to 7.7, change = -11.5
7.7 to 22.9, change = 15.2
22.9 to 18.4, change = -4.5
18.4 to -1.6, change = -20.0
-1.6 to 14.6, change = 16.2

If there are any non-numeric tokens of input in the file, your program should skip over 
them and ignore them. You may assume that the user types the name of a file that exists and is readable.
*/



public class Weather extends ConsoleProgram {
    public void run() {
        try{
            String file = readLine("Input file? ");
            Scanner s = new Scanner (new File (file));
            double n1 = s.nextDouble();
            /* in order to include all the doubles present in file, the condition must be 
            while(s.hasNext()) and not s.hasNextDouble(). This is because some doubles may be 
            separated by Strings or other chars, and we need to skip those chars != doubles, that is why
            we check  inside of  while(s.hasNext()) loop if(s.hasNextDouble()) is true, otherwise we just read in another 
            value s.next() and check if it is a double*/
            
            while(s.hasNext()){
                if(s.hasNextDouble()){      
                    double n2 = s.nextDouble();
                    double change = n2 - n1;
                    printf("%.1f to %.1f, change = %.1f\n", n1 , n2, change);
                    n1 = n2;
                }
                else {
                    s.next();
                }             
            }
        }
        catch (FileNotFoundException ex) {
            println("File not found! ");
        }
    }
}
