private void reverseChunksInFile (Scanner input){
        while(input.hasNextLine()){
            String s = input.nextLine();
            Scanner line = new Scanner (s);
            while(line.hasNext()){
                String word = line.next();
                int k = line.nextInt();
                printf(reverseChunks(word, k) + " "); 
            }
            println();
        }
}

private String reverseChunks (String s, int k){
    int len = s.length();
    if (len >= k) {
        String revChunk = "";
        int done = (len/k) * k;
        for (int i = 0; i <= len - k; i+=k){
            for(int j = k + i -1; j >=i; j--){
            revChunk += s.charAt(j);
            }
        }
        for (int i = done; i < len; i++) {
            revChunk += s.charAt(i);
        }

    return revChunk;
    }
    return s;
}
