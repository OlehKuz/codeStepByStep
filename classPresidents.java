private void classPresidents (Scanner input){
    int j = 0;
    String jN = "";
    int s = 0;
    String sN = "";
    while (input.hasNext()) {
        String name = input.next();
        String clas = input.next();
        int votes = input.nextInt();
        if (votes > j && clas.equals("j")) {
            jN = name;
            j = votes;
        }
        else if (votes > s && clas.equals("s")) {
            sN = name;
            s = votes;
        }    
    }
    printf("Sophomore Class President: %s (%d votes)\n", sN, s);
    printf("Junior Class President: %s (%d votes)\n", jN, j);
}
