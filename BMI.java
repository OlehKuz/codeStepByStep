public class BMI extends ConsoleProgram {
    public void run() {
        println("This program reads data for two people");
        println("and computes their body mass index (BMI).");
        println();
        person(1);
        person(2);
        println("Have a nice day!");
    }
    
    private void person(int num) {
        println("Person " +num+"'s information:");
        double height = readDouble("height (in inches)? ");
        double weight = readDouble("weight (in pounds)? ");
        double body = bodyIndex(height,weight);
        String category = bodyCategory(body);
        printf("BMI = %.1f\n", body);
        println(category);
        println();
    }
    
    private double bodyIndex(double height,double weight) {
        double index = weight / Math.pow(height, 2) * 703;
        return index;
    }
    
    private String bodyCategory(double body){
        String category = "";
        if(body>=30.0){
            category = "class 4";
        }
        else if (body>=25.0) {
            category = "class 3";
        }
        else if (body>=18.5) {
            category = "class 2";
        }
        else {
            category = "class 1";
        }
        return category;
    }
}
