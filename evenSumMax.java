public void evenSum(){
    int evenS = 0; 
    int evenMax = 0;
    int many = readInt("how many integers? ");
    int count = 0;
    while(count < many){
        int numb = readInt("next integer?");
        if (numb % 2 == 0){
            evenS += numb;
            if (numb > evenMax) {
                evenMax = numb;
            }
        }
        count++;
    }
    println("even sum = "+evenS);
    println("even max = "+evenMax);
}
