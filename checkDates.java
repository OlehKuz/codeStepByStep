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
