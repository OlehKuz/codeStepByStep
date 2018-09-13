public static void flipCoins(Scanner input){      
        while (input.hasNextLine()) {
            double heads = 0;
            double flips = 0;
            String line = input.nextLine();
            Scanner lineTokens = new Scanner(line);
            while(lineTokens.hasNext()){
                String c = lineTokens.next();
                // I cannot use a char for this     
                if(c.equalsIgnoreCase("h")){
                    heads++;
                }
                flips++;
            }
            double percentage = (heads / flips) * 100 ;
            // I cannot use printf function instead
            println((int)heads + " heads (" + (int)percentage + "%)");
            if(percentage > 50){
                println("There were more heads!");
            }
            println();
        }
}
