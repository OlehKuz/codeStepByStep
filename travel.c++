 /* Write a recursive function named travel that accepts integers x and y as parameters and uses recursive backtracking 
 to print all solutions for traveling in the 2-D plane from (0, 0) to (x, y) by repeatedly using one of three moves:

    East (E): move right 1 (increase x)
    North (N): move up 1 (increase y)
    Northeast (NE)
    
    */
    
 void travelHelp(int x, int y, string path){
 // base case : whne we reach our destination, print it 
    if(x == 0 && y == 0){
        cout << path << endl;
    }
    else if(x >= 0 && y >= 0){
    // try going into each direction , subtract one from that direction that we have left to go,
    // and save where we are going into path string. We dont need to backtrack, 
    // because w every function call we get new string
        travelHelp(x - 1, y, path + "E ");
        travelHelp(x, y - 1, path + "N ");
        travelHelp(x - 1, y - 1, path + "NE ");
    }
}

void travel(int x, int y){
    travelHelp(x, y, "");
}



