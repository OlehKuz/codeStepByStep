/*You cant do this in java. I cant just add a string, i need to go through all
of its characters and add them one by one*/


private String repeat(String s, int repetitions){
    String new = "";
    for(int i = 0; i < repetitions; i++){
        new += s;
    }
    return s;
}
