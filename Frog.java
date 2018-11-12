public class Frog extends Critter {
    private int ageFrog;
    private int movesDone;
    
    public Frog(int age) {
        ageFrog = age;
        movesDone = 0;
    }
    
    public Color getColor(){
        return Color.GREEN;
    }
    
    public Direction getMove(){
        movesDone++;
        Direction d = Direction.CENTER;
        if(movesDone%ageFrog == 0){
            d = Direction.EAST;
        }
        return d;
    }
    
    public String toString(){
        return "F";
    }
}
