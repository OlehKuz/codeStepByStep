/*
Each line of the file will contain four integers representing a pair of calendar dates in month/day format.
Your method should read the contents of this file and check to see which pairs of dates are at least one month apart from each other.

Assume that all parameters passed are valid (i.e., the month will be between 1 and 12, and the day will be between 1 and 
the number of days in that month). You may assume that the file is in a valid format  and that all dates occur during the same year.
Assume that this is a non-leap year and do not worry about leap years for this problem.
*/


private void checkDates (String file) {
    try{
        Scanner input = new Scanner (new File (file));
        while (input.hasNextLine()){
            String line = input.nextLine();
            Scanner readLine = new Scanner (line);
            int Firstm = readLine.nextInt();
            int Firstd = readLine.nextInt();
            int Secondm = readLine.nextInt();
            int Secondd = readLine.nextInt();
            
            /* There should be 3  cases of checking if 2 dates differ by one month, one if the month goes before, one if the 
            month is the previous. And if month differ by more than 2, you dont need to do extra check */
            
            if (Firstm - Secondm > 1 || Firstm - Secondm < -1){
                 printf("%d/%d and %d/%d differ by one full month or more!\n", Firstm,Firstd,Secondm,Secondd);
            }
            else if(Firstm - Secondm == 1){
                if(Firstd - Secondd >=0){
                    printf("%d/%d and %d/%d differ by one full month or more!\n", Firstm,Firstd,Secondm,Secondd);
                }
                else{
                    printf("%d/%d and %d/%d are within one month of each other.\n", Firstm,Firstd,Secondm,Secondd);
                }
            }
            else if(Firstm - Secondm == -1){
                if(Firstd - Secondd <=0){
                    printf("%d/%d and %d/%d differ by one full month or more!\n", Firstm,Firstd,Secondm,Secondd);
                    }
                else{
                    printf("%d/%d and %d/%d are within one month of each other.\n", Firstm,Firstd,Secondm,Secondd);
                }
            }
            else{
                printf("%d/%d and %d/%d are within one month of each other.\n", Firstm,Firstd,Secondm,Secondd);
            }
        }
    }
    catch (FileNotFoundException ex) {
    
    }
}
