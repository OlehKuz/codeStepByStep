public class CountNames extends ConsoleProgram {
    /*
     If a map calls put() on a key that already exists, it retains its current position in the ordering (Default). 
    */
    public void run(){
        ReadInNames();
    }
    
    public void ReadInNames(){
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        while(true){
            String name = readLine("Enter name: ");
            if(name.equals("")) break;
            else if(map.containsKey(name)){
                map.put(name, map.get(name)+1);
            }
            else{
                map.put(name, 1);
            }
        }
        printMap(map);
    }
    
 
    public void printMap(HashMap<String, Integer> map){
        for(String name:map.keySet()){
            println("Entry ["+name+"] has count " + map.get(name));
        }
    }
}
