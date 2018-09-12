/* 
M
MA
MAR
MART
MARTY
 ARTY
  RTY
   TY
    Y     */

private void nameDiamond(String s){
    int len = s.length();
    for(int i = 0; i < len; i++) {
        for(int j = 0; j <= i; j++){
            print(s.charAt(j));
        }
        println();
    }
     for(int i = 1; i < len; i++) {
        for(int k = 1; k <= i; k++){
            print(" ");
        }
        for(int j = i; j < len; j++){
            print(s.charAt(j));
        }
        println();
    }
}
