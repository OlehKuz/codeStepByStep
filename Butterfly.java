public class Butterfly extends Critter{
    private int moves;
    
    public Butterfly(){
        moves = 0;
    }
    
    public Color getColor(){
        return Color.YELLOW;
    }
    
    public Direction getMove(){
        Direction d = Direction.CENTER;
        moves++;
        if(moves % 2 != 0){
            d = Direction.NORTH;
        }
        else if (moves == 2){
            d = Direction.WEST;
        }
        else{
            d = Direction.EAST;
            moves = 0;
        }
        return d;
    }
    
    
    public String toString(){
        String view = "x";
        if(moves % 2 != 0){
            view = "-";
        }
        return view;
    }
}
