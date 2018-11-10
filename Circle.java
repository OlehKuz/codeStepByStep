public class Circle extends GraphicsProgram{
    private double radius;
    
    public Circle(double rd){
        GArc cl = new GArc(radius*2, radius*2, 0, 360);
        add(cl);
        radius = rd;
    }
    
    public double area(){
        return Math.PI*Math.pow(radius,2);
    }
    
    public double circumference(){
        return 2*Math.PI*radius;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public String toString(){
        return "Circle{radius="+radius+"}";
    }
}
