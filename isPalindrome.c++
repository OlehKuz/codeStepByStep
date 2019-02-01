bool isPalindrome(string word){
    string l = toLowerCase(word);
    int len = word.length();
    if(len==0 || len==1){
        return true;
    }
    else{
        return l[0]==l[len-1]&& isPalindrome(l.substr(1, len-2));
    }
}



