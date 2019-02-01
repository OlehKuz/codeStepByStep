void combinHelp(string s, string constructed,HashSet<string>& set){
    if(s == ""){
        if(!set.contains(constructed)){
            cout <<constructed<< endl;
            set.add(constructed);
        }
    }else{
        for(int i = 0; i < s.length(); i++){
            string ch ;
            ch += s[i];
            s = s.substr(0, i) + s.substr(i+1);
            combinHelp(s, constructed + ch,set);
            s.insert(i, ch);
        }
    }
}

void combin (string s){
    HashSet<string> set;
    combinHelp(s, "", set);
}









