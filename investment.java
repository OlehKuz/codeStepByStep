public class Investment extends ConsoleProgram {
    public void run (){
        investor(1);
        investor(2);
        println("Have a nice day!");
       
    }
    private void investor(int inv){
        printf("Investor #%d:\n", inv);
        double initial = readDouble("Initial amount? ");
        double rate = readDouble("Interest rate%? ");
        int month = readInt("Num. of months? ");
        double future = finaly(initial, rate, month);
        double profitAbs = profitAbs(initial, future);
        double profitRel = profitRel(profitAbs, initial);
        String quality = quality(profitRel);
        printf("Final amount = $%.2f\n", future);
        printf("Profit = $%.2f (%.0f%%)\n", profitAbs ,profitRel);
        println(quality);
        println();
    }

    private double finaly(double initial,double rate, int month) {
        double future = initial * Math.pow((1 + rate), month);
        return future;
    }

    private double profitAbs(double initial, double future){
        return future - initial;
    }
    private double profitRel(double profitAbs,double initial){
        double profitRel = Math.round(profitAbs / initial * 100);
        return profitRel;  
    }    

    private String quality(double profitRel){
        String s = "";
        if(profitRel > 50){
            s = "strong";
        }
         else if(profitRel > 10){
            s = "medium";
        }else {
            s = "weak";
        }
        return s;
    }
}
