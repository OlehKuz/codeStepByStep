public class RobotFace extends GraphicsProgram {
    private static final int HEAD_WIDTH   = 150;
    private static final int HEAD_HEIGHT  = 250;
    private static final int EYE_RADIUS   = 15;
    private static final int MOUTH_WIDTH  = 80;
    private static final int MOUTH_HEIGHT = 30;

    public void run() {
        setSize(500, 300);
        double x = getWidth() / 2;
        double y = getHeight() / 2;
        GRect face = new GRect(x - HEAD_WIDTH / 2, y - HEAD_HEIGHT / 2, HEAD_WIDTH, HEAD_HEIGHT);
        face.setFilled(true);
        face.setFillColor(Color.GRAY);
        face.setColor(Color.GRAY);
        add(face);
        eyes(x - HEAD_WIDTH / 4 - EYE_RADIUS, y - HEAD_HEIGHT / 4 - EYE_RADIUS);
        eyes(x + HEAD_WIDTH / 4 - EYE_RADIUS, y - HEAD_HEIGHT / 4 - EYE_RADIUS);
        GRect mouth = new GRect(x - MOUTH_WIDTH / 2, y + HEAD_HEIGHT / 4, MOUTH_WIDTH, MOUTH_HEIGHT);
        mouth.setFilled(true);
        mouth.setFillColor(Color.WHITE);
        mouth.setColor(Color.WHITE);
        add(mouth);
        
    }
    
    private void eyes (double x, double y) {
        GOval eye = new GOval(x, y,EYE_RADIUS * 2, EYE_RADIUS * 2);
        eye.setFilled(true);
        eye.setFillColor(Color.YELLOW);
        eye.setColor(Color.YELLOW);
        add(eye);
    }
}
