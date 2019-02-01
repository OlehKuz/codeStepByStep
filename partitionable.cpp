bool partitionableH(Vector<int>& v, int currentSum,const int& sum){
    if(v.isEmpty()) {
         return false;
    }
    else {
        if(currentSum == sum - currentSum){
            return true;
        }
        // choose
        int index = v.size()-1;
        int n = v[index];
        v.remove(index);
        
        //explore 
        bool k = partitionableH(v,currentSum, sum)
               || partitionableH(v, currentSum + n, sum);
        
        //unchoose
        v.insert(index, n);
        
        return k;
    }
} 


bool partitionable(Vector<int>& v){
    if(v.isEmpty()) return true;
    int sum = 0;
    for(int n: v){
        sum+=n;
    }
    return partitionableH(v, 0, sum);
}
