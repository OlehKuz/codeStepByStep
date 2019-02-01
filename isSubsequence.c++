bool isSubsequence(string bigger, string small){
    // base case 1 : if we have characters left in smaller string, 
    // that it is impossible for it to be a substring of bigger string
    if(bigger.length() == 0 && small.length() > 0){
        return false;
    }
    // base case 2
    else if(small.length() == 0){
        return true;
    }
    else if (bigger[0] == small[0]){
        return isSubsequence(bigger.substr(1), small.substr(1));
    }
    else {
        // if characters dont match, just move on to next char in bigger string 
        return isSubsequence(bigger.substr(1), small);
    }
    
}


