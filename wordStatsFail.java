private void wordStats (String file){
    try{
        Scanner input = new Scanner (new File(file));
        int total = 0;
        int unique = 0;
        String uniq = "";
        int lenU = 0;
        int leng = 0;
        double average = 0;
        while(input.hasNext()){
            String s = input.next();
            total++;
            String sS = s.toLowerCase();
            int lenS = s.length();
            leng += lenS;
            if (lenU == 0){
                uniq = sS.substring(0, 1);
                unique++;
                lenU++;
                
            }
            
            for (int i = 0; i < lenS; i++){
                int count = 0;
                String letter = sS.substring(i, i+1);
                 for (int j = 0; j < lenU; j++){
                      
                      String st = uniq.substring(j, j+1);
                      if (st.equals(letter)){
                          count++;
                          }
                      
                       }
                    if (count == 0) {
                          unique++; 
                          uniq += letter;
                          lenU++;
                      }
                
                }
            
            }
            average = (double)leng/total;
            printf("Total words    = %d\nAverage length = %.1f\nUnique letters = %d\n", total, average, unique);
        }
    catch (FileNotFoundException ex) {
    }
}
