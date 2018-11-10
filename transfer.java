public boolean transfer(BankAccount recepient, double amount){
    if(this.balance >= 5 && amount > 0){
        balance-=5;
        if(amount > balance){
            amount = balance;
        }
        recepient.balance += amount;
        balance -= amount; 
        recepient.transactions++;
        transactions++;
        return true;
    }
    return false;
}
