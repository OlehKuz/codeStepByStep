string collapseSequences(string s, char c, bool collapse){
    string st = "";
    if(s.length() == 0){
    
    }
    else{
        if(s[0] == c){
            if(!collapse) st += s[0];
            collapse = true;
        }else{
            collapse = false;
            st += s[0];

        }
        st += collapseSequences(s.substr(1), c, collapse);
    }    
    return st;
}


string collapseSequences(string s, char c){
    bool collapse = false;
    return collapseSequences(s, c, collapse);   
}



