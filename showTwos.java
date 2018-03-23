/* If i dont initialise odd variable and use num variable in while 
   loop, the value of num after while loop being executed will be 
   the odd number we are looking for. So program counts num as global variable
   in this method, and saves its changed value after while loop instead of
   previous value of num, when it is first inputed as parameter to the showTwos method*/
private void showTwos (int num) {
    int counter = 0;
    int odd = num;
    while(odd % 2 == 0){
        odd /= 2;
        counter++;
    }
    String result = "";
    for (int i = 0; i < counter; i++) {
        result+="2 * ";
    }
    println(num + " = " + result + odd);
}
