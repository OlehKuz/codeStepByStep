public boolean transactionFee(double fee){
    double feeAmount = 0; 
    for(int withdraw = 1; withdraw <= transactions; withdraw++){
        feeAmount += withdraw * fee;
    }
    if(balance - feeAmount > 0){
        balance -= feeAmount;
        return true;
    }
    balance = 0;
    return false;
}
