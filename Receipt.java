public class Receipt extends ConsoleProgram {
    public void run() {
        // Compute total owed, assuming 8% tax and 15% tip
        int Subtotal = (38 + 40 + 30);
        println("Subtotal: " + Subtotal);
        double Tax = Subtotal * .08;
        println("Tax: " + Tax);
        double Tip = Subtotal * .15;
        println("Tip: " + Tip);
        double Total = Subtotal + Tax + Tip;
        println("Total: " + Total);
    }
}
