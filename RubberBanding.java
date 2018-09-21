public class RubberBanding extends GraphicsProgram {
    private static int xO;
    private static int xI;
    private static int yO;
    private static int yI;
    
    public void run() {
        setCanvasSize(400, 250);
        setBackground(Color.WHITE);
        addMouseListeners();     
    }
    public void mousePressed (MouseEvent event){
        xO = event.getX(); 
        yO = event.getY(); 
    }
    public void mouseDragged (MouseEvent event){
        xI = event.getX(); 
        yI = event.getY(); 
    }   
    public void mouseReleased (MouseEvent event){
        add(new GLine(xO, yO, xI, yI));
    }
}
