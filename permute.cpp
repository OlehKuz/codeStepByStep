void permuteHelp(string s, string constructed){
    if(s == ""){
        cout <<constructed<< endl;
    }else{
        for(int i = 0; i < s.length(); i++){
            string ch ;
            ch += s[i];
            s = s.substr(0, i) + s.substr(i+1);
            permuteHelp(s, constructed + ch);
            s.insert(i, ch);
        }
    }
}

void permute(string s){
    permuteHelp(s, "");
}



