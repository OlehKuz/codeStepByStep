void listTwiddlesHelp(const string &str, const Lexicon& english, string built, int index){
    if(str.length() == index && english.contains(built)){
        cout << built << endl;
    }
    else if (index < str.length()){
            char c = str[index];
            for(int i = -2; i <= 2; i++){
                char ch = c+i;              
                if(ch >= 'a' && ch <= 'z'){
                    listTwiddlesHelp(str, english, built + ch, index + 1);
                    
                }
            }
        
    }
    
}

void listTwiddles(string str, Lexicon& english){
    listTwiddlesHelp(str, english, "", 0);
}



