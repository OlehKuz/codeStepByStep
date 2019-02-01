void hanoiHelp(int disk, int start, int end, int med){
    if(disk == 1){
        cout << "move disk " <<disk<<" from peg " << start << " to peg " << end << endl;
    }
    else{
        // move n - 1 top disks to free pag, that is not destination peg
        hanoiHelp(disk-1, start, med, end);   
        // move the disk that was on the bottom to the destination peg
        cout << "move disk " <<disk<<" from peg " << start << " to peg " << end << endl;
        // move the rest of disks to end peg
        hanoiHelp(disk-1, med, end, start);
    }
}


void hanoi(int disk, int start, int end){
    // finding what a 3 disk is. There count of disks is 3 + 2 + 1, 
    // so to find the 3 disk, just subtract start and end disk from 6 
    int med = 6 - start - end;
    hanoiHelp(disk, start, end, med);
}



