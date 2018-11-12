public class Snake extends Critter {
    private int localCount;
    private int stepsToMove;
    private boolean east;
    public RandomGenerator rg = RandomGenerator.getInstance();
    
    public Snake(){
        localCount = 0;
        stepsToMove = 1;
        east = true;
    }
    
    public Attack fight(String opponent){
        Attack ft = rg.nextBoolean() ? Attack.POUNCE : Attack.ROAR;
        return ft;
    }
    
    public Color getColor(){
        Color c = new Color(20,50,128);
        return c;
    }
    
    public Direction getMove(){
        Direction d;
        if(localCount < stepsToMove){
			if(east){
                d = Direction.EAST;
			}
			else{
				 d = Direction.WEST;
			}
			localCount++;
		}else{			
			stepsToMove++;
			localCount = 0;
			east = !east;
            d = Direction.SOUTH;
		}
        return d;
    }
    
    public String toString(){
        return "S";
    }
}



