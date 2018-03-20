public class Receipt2 extends ConsoleProgram {
    public void run() {
        // Calculate total owed, assuming 8% tax / 15% tip
        int subtotal = readInt("What was the meal cost? $");
        double tax = subtotal * .08;
        double tip = subtotal * .15;
        double total = subtotal + tax + tip;

        println("Subtotal: " + subtotal);
        println("Tax: " + tax);
        println("Tip: " + tip);
        println("Total: " + total);
    }
}
