private void printBox (String name, int width) {
    try {
        Scanner scan = new Scanner(new File(name));
        for(int i = 0; i < width; i++){
            print("#");
        }
        println();
        while (scan.hasNextLine()){
            String line1 = scan.nextLine();
            String line = line1.toLowerCase();
            int len = line.length();
            print("#");
            if(len < width - 2) {
                for(int k = 0; k < len; k++){
                    if(k == 0){
                        print(line.substring(k, k + 1).toUpperCase());
                    }
                    else{
                        print(line.substring(k, k+1));
                    }
                }
                for(int l = len; l < width - 2; l++){
                    print(" ");
                }
                println("#");
            }
                
            else {
                for(int j = 0; j < width - 2; j++){
                    if (j == 0){
                        print(line.substring(j, j + 1).toUpperCase());
                    }
                    else{
                        print(line.substring(j, j+1));
                    }
                }
                println("#");
            }
        } 
        for(int i = 0; i < width; i++){
            print("#");
        }
    }
    catch (FileNotFoundException ex){
        println("WTF");
        
    }
    
}
