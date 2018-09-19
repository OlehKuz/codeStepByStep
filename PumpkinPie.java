public class PumpkinPie extends GraphicsProgram {
    public void run() {
        setCanvasSize(300, 200);
        double x = (double)getWidth() / 2;
        double y = (double)getHeight() / 2;
        GOval oval = new GOval(x - 50, y - 50, 100, 100);
        oval.setFilled(true);
        oval.setFillColor(new Color(255, 128, 0));
        add(oval);
        add(new GLine (x, y - 50, x, y + 50));
        add(new GLine (x - 50, y , x + 50, y));
    }
}
