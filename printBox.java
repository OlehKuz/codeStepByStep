/*
printBox("poem.txt", 19);		
###################
#Roses are red    #
#Violets are blue #
#                 #
#All my base      #
#Are belong to you#
###################

printBox("poem.txt", 30);
##############################
#Roses are red               #
#Violets are blue            #
#                            #
#All my base                 #
#Are belong to you           #
##############################

printBox("poem.txt", 7);
#######
#Roses#
#Viole#
#     #
#All m#
#Are b#
#######

 If any lines in the file are too long to fit into the box, truncate them.
You may assume that the input file exists and is readable, and that its lines can fit within the given width. 
You may assume that the width value passed will be at least 2. 
Notice that the file might contain blank lines. Your solution should read the file only once, 
not make multiple passes over the file data.
*/



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
            
            /* If string is shorter than a width - two #, then we need to add " " spaces to make a box.
                Also be careful not to access outOfBounds index, if string is shorter than width - 2: access
                only substring up to String`s length */
            
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
                // If String is longer than width - 2, cut that string
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
