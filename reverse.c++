string reverse(string s){
    // if we have one character or empty string, just return it 
    if(s.length() == 1 || s.length() == 0){
        return s;
    }
    else{
        string st = "";
        // append current character to the end of reversed string
        st += reverse(s.substr(1)) + s[0];
        return st;
    }
}



