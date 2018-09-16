/*  If i have a try / catch statement, i cant declare a variable I need to return in
    try clause, because it fails w an error MissingReturnStatement.
    I always need to return a method value outside of try / catch clauses, even if I 
    already return sth inside of try / cause clauses */

private double averageValueInFile (String file){
    int count = 0;
    double sum = 0;
    double average = 0.0;
    try{
        Scanner input = new Scanner(new File (file)); 
        while (input.hasNextDouble()){
            sum += input.nextDouble();
            count++;
        }
        if(count != 0){
            average = sum / count;
        }
    }   
    catch (FileNotFoundException ex) {
    
    }
    return average;     
     
} 
