private boolean negativeSum (Scanner file){
        int sum = 0;
        int step = 0;
        while(file.hasNextInt()) {
            int num = file.nextInt();
            step++;
            sum += num;
            if (sum < 0){
                println(sum + " after " + step + " steps");
                return true;
            } 
        }
        println("no negative sum");
        return false; 
}
