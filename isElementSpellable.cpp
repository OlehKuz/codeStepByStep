bool isElementSpellableHelp(string elm, string text, const Lexicon & chemistry){
    if(text.length() == 0){
        if((elm.length() == 0)){
            return true;
        }else{
            return chemistry.contains(elm);
        }
    }
    else {
        int len = text.length();
        bool success1 = false;
        if(chemistry.contains(text.substr(0,1))){
            success1 = isElementSpellableHelp(text.substr(0,1), text.substr(1), chemistry);
        }
        bool len3 = len > 2;
        bool len2 = len > 1;
        bool success2 = false;
        bool success3 = false;
        if(len2){
            if(chemistry.contains(text.substr(0,2))){
                success2 = isElementSpellableHelp(text.substr(0,2), text.substr(2), chemistry);
            }
        }
        if(len3){
            if(chemistry.contains(text.substr(0,3))){
                success3 = isElementSpellableHelp(text.substr(0,3), text.substr(3), chemistry);
            }
        }
        return success1 || success2 || success3;
    }
}

bool isElementSpellable(string text, Lexicon & chemistry){
     return isElementSpellableHelp("", text, chemistry);              
}



