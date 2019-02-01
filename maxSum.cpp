int maxSumHelp(Vector<int> & copy, int target, int sum){
    if(sum > target){
        return 0;
    }
    if(copy.isEmpty()){
        cout << "Local Max: "<< sum << " vector " << copy << endl;
        return sum;
    }
    else {
        int size = copy.size();
        int n = copy[size-1];
        copy.remove(size - 1);

        int with = maxSumHelp(copy, target, sum + n);
        int without = maxSumHelp(copy, target, sum);
        
        copy.add(n);
        int next =  max(with, without);
       return max(next, sum);

    }
}

int maxSum(Vector<int> & v, int target){
    return maxSumHelp(v, target,0);
}

