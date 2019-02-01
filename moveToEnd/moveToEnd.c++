void moveHelp(string& s, string c, int index, int len){
    if(index == len){
    
    }else{
        // if current char in our string at current index equals char we are looking for, 
        // add the char to the end of string, remove this char at current index, end reduce the length of
        // a string we need to check for equality by one, because at the end of this string we already 
        // have put one more char. Call moveHelp function w the current index again, because character 
        // in our string have shifted by one to the left 
        if(equalsIgnoreCase(s.substr(index, 1), c) ) {
            s+=c;
            s.erase(index, 1);
            moveHelp(s, c, index, len - 1);
        }
        else{
            moveHelp(s, c, index + 1, len);
        }
    }
}


string moveToEnd(string s, char c){
    int index = 0;
    int len = s.length();
    // just convert character that is passed to its uppercase string representation
    string ch = "" ;
    ch += c;
    ch = toUpperCase(ch);
    
    moveHelp(s, ch, index, len);
    return s;
}




