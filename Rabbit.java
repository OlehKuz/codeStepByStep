public class Rabbit extends Critter {
    private boolean hungry;
    private int timesToHop;
    private int oneDirection;
    private int hops;
    
    public Rabbit(){
        hungry = false;
        timesToHop = 6;
        oneDirection = 2;
        hops = 0;
    }
    
    public Color getColor(){
        return Color.DARK_GRAY;
    }
    
    public boolean eat(){
        hungry = !hungry;
        return hungry;
    }
    
    public Direction getMove(){
        Direction d = Direction.CENTER;
        if(hops / oneDirection == 0){
            d = Direction.NORTH;
        }
        if(hops / oneDirection == 1){
            d = Direction.SOUTH;
        }
        if(hops / oneDirection == 2){
            d = Direction.EAST;
        }
        hops++;
        if(hops >= timesToHop){
            hops = 0;
        }
        return d;
    }
    
    public Attack fight(String opponent){
        Attack kill = Attack.ROAR;
        if(opponent.equalsIgnoreCase("Bird")){
            kill = Attack.SCRATCH;
        }
        return kill;
    }
    
    public String toString(){
        return "V";
    }   
}
