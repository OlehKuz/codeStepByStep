public class Sunset extends GraphicsProgram {
    public void run() {
        setCanvasSize(500, 300);
        setBackground(Color.CYAN);
        GRect rect = new GRect (0, 0, 500, 230);
        rect.setFilled(true);
        rect.setFillColor(Color.BLACK);
        add(rect);
        GRect Srect = new GRect (0, 230, 500, 70);
        Srect.setFilled(true);
        Srect.setFillColor(Color.GREEN);
        Srect.setColor(Color.GREEN);
        add(Srect);
        double x = getWidth() / 2;
        double y = getHeight() / 2;
        GOval sun = new GOval (x - 25, y - 25, 50, 50);
        sun.setFilled(true);
        sun.setFillColor(Color.YELLOW);
        sun.setColor(Color.GREEN);
        add(sun);
        while(sun.getY() < getHeight() - 70){
            sun.move(0, 2);
            pause(50);
        }
        sun.setFillColor(Color.GREEN);
        setBackground(Color.BLACK); 
    }
}
