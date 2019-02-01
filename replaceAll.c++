string replaceAll(string s, char from, char to){
    string st = "";
    if(s.length() == 0){
    
    }
    else{
        if(s[0] == from){
            st += to;
        }
        else{
            st += s[0];
        }
        st += replaceAll(s.substr(1), from, to);
    }    
    return st;
}




