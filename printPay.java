/* If i declare double pay inside an if statement , code will not compile. 
It sees pay variable only inside that if statement. The best is to declare variable with
a standart case not inside of any conditions and then assign other values to this variable 
in case of my if statement.
*/
private void printPay(double wage, int hours) {
    printf("Hours worked: %d\n", hours);
    double pay = hours * wage; 
    if(hours > 8){
        pay = (hours - 8) * wage * 1.5 + 8 * wage;
    }         
    printf("Pay earned: $%.2f", pay);    
}
