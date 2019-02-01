void reverseLines(ifstream& file){
    string current = "";
    // while our file has lines, save current line from our file into string current, 
    // call our function again, with the internal state of our ifstream changed 
    // (it already has 1 fewer lines to read). when there are no more lines to read, 
    // we print last read line, second to last line and so on, as our stack calls pop off
    if(getline(file, current)){
        reverseLines(file);
        cout << current << endl;
    }
}



