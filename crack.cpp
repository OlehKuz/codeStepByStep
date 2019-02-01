string crackhelp(int n, string &password, bool& found){
    if(n < 0){
        throw(n);
    }else if(!found){
        bool logSuccess = login(password);
        if(logSuccess){
            found = true;
            return password;
        }
        if(n == 0){
            return "";
        }
        for(char c = 'a'; c <= 'z'; c++){
            password += c;
            crackhelp(n - 1, password, found);
            if(found) return password;
            password.pop_back();

        }
        for(char big = 'A'; big <= 'Z'; big++){
            password += big;
            crackhelp(n - 1, password, found);
            if(found) return password;
            password.pop_back();
        }
    }
    return "";
}

string crack(int n){
    string password = "";
    bool found = false;
    return crackhelp(n, password, found);
}


