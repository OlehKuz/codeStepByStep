bool canBalanceHelp(Vector<int > & weights,int left, int right, bool balanced){
    if(left == right){
        // still explores all posibilities. Doesnt exit after finding one solution.
        balanced = true;
        return balanced;
    }

    else if(!balanced){

        bool balanceWithout = false;
        bool balanceWLeft = false;
        bool balanceWRight = false;
        if (!weights.isEmpty()){
            int lastIndex = weights.size() - 1;
            int weight = weights[lastIndex];
            // remove from original vector
            weights.remove(lastIndex);
            balanceWLeft = canBalanceHelp(weights, left + weight, right, balanced); // together w target weigth
            balanceWRight = canBalanceHelp(weights, left,  right + weight, balanced); // on the other side
            balanceWithout = canBalanceHelp(weights, left, right, balanced); // without it
            // insert back into original vector
            weights.add(weight);
        }

        return balanceWithout || balanceWLeft || balanceWRight;
    }
    return false;
}

bool canBalance(int target, Vector<int> &weights){
    int left = target;
    bool balanced = false;
    return canBalanceHelp(weights, left, 0, balanced);
}




