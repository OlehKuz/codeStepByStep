private String addCommas (String num) {
    String commas = "";
    int counter = 0;
    // Add characters starting from the last one
    for(int i = num.length() - 1; i >= 0; i--){
        commas = num.charAt(i) + commas;
        counter++;
        // i>0 ensures, that we will not add a ',' before a digit, if it is to be the first digit of a number
        if(counter % 3 == 0 && i > 0){
            commas = "," + commas;
        }
    }
    return commas;
}
