bool squishWordHelp(string word, const Lexicon & english, Vector<string>& squished, bool & found){
    if(word.length() == 1){
        cout << squished << endl;
        found = true;
        return found;
    }else if(!found){
        bool result = false;
        if(english.contains(word)){
            int len = word.length();
            string tryWord = "";
            for(int i = 0; i < len; i++){
                tryWord = word.substr(0, i) + word.substr(i + 1);
                if(english.contains(tryWord)){
                    squished.add(tryWord);
                    result = squishWordHelp(tryWord, english, squished, found);
                    squished.removeBack();
                }      
            }
        }
        return result;
    }
    return true; // makes sure that we dont print not found , when found is set to true 
    //and we dont execute recursive case
    
}

void squishWord(string word, Lexicon & english){
    Vector<string> squished {};
    if(english.contains(word)){
        squished.add(word);
    }
    bool result = false;
    bool found = squishWordHelp(word, english,squished, result);
    if(!found){
        cout << "No path found." << endl;
    }
}

