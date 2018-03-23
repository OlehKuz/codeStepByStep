private void printPay(double wage, int hours) {
    printf("Hours worked: %d\n", hours);
    double pay = hours * wage; 
    if(hours > 8){
        pay = (hours - 8) * wage * 1.5 + 8 * wage;
    }         
    printf("Pay earned: $%.2f", pay);    
}
