/*
  I cant create new GLabel("text", x, y), because my variables x and y are after the call;
  if i put them up , then the compiler tells me that cant find variable lebel. 
*/


public class CenteredText extends GraphicsProgram {
    public void run() {
        setCanvasSize (500, 200);    
        GLabel lebel = new GLabel("CS106A rocks my socks!");
        lebel.setFont(new Font("SansSerif",Font.PLAIN, 28));
        add(lebel);
        double x = 250 - ((double)lebel.getWidth() / 2);
        double y = 100 + (double)lebel.getAscent() / 2;
        lebel.setLocation(x, y);     
    }
}
