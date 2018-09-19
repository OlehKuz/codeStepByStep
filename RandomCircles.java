public class RandomCircles extends GraphicsProgram {
    private RandomGenerator rgen = RandomGenerator.getInstance();
    public void run () {
        setCanvasSize (450, 250);
        for(int i = 0; i < 10; i++){
            int radius = rgen.nextInt(5 , 50);        
            int x = rgen.nextInt(0 , 450 - 2 * radius);
            int y = rgen.nextInt(0 , 250 - 2 * radius);
            int red = rgen.nextInt(0 , 255);
            int green = rgen.nextInt(0 , 255);
            int blue = rgen.nextInt(0 , 255);
            GOval oval = new GOval (x, y, 2*radius,2*radius);
            oval.setFilled(true);
            oval.setFillColor(new Color(red, green, blue));
            oval.setColor(new Color(red, green, blue));
            add(oval);
        }
    }
}
