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
