int matchCountHelp(const Vector<int>& v1, const Vector<int>& v2, int mini, int index){
   
    int n = 0;
    if(index < mini){      
        if(v1[index]==v2[index]){
            n++;
        }
        index++;
        n += matchCountHelp(v1, v2, mini, index);
       
    }
    return n;
}


int matchCount(Vector<int>& v1, Vector<int>& v2){
    int l1 = v1.size();
    int l2 = v2.size();
    int mini = min(l1, l2);
    int index = 0;
    return  matchCountHelp(v1, v2, mini, index);
}



