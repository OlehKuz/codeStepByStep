/* Method accepts three integers as parameters and returns true if they are three consecutive numbers.
   Order is not significant*/
private boolean threeConsecutive(int a, int b, int c){
    int max = Math.max(a, Math.max(b, c));  
    int min = Math.min(a, Math.min(b, c));
    int average = (a + b + c) / 3;
    int average1 = min + 1;
    int average2 = max - 1;
    return average == average1 && average1  == average2;
}
