int longestRunHelp(Vector<int> &v, int previos, int index, int count){
    if(index == v.size()){
        return count;
    }
    else{
        int current = v[index];
        index++;
        if(current >= previos){
            count++;           
            return longestRunHelp(v,current,index,count);
        }        
        else{
            int nextCount = longestRunHelp(v,current,index,1);
            if(nextCount > count){
                count = nextCount;
            }
        }
        return count;
    }
}

int longestRun(Vector<int> &v){
    int previos = v[0];
    return longestRunHelp(v, previos, 1, 1);
}


