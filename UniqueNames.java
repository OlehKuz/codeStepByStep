public class UniqueNames extends ConsoleProgram {
    public void run(){
        askNames();
        printNames();
    }
    public void askNames(){    
        while(true){
            String names = readLine("Enter name: ");
            if(names.equals("")){
                break;
            }
            addToList(names);            
        }
    }

    public void addToList(String input){
          for(int i = 0; i < list.size(); i++){
                if(list.get(i).equals(input)){
                    // i need to return , not to break; if i break, it will add input to a list.
                     return;
                }                
            } 
        list.add(input);
    }

    public void printNames(){
        print("Unique name list contains: ");
        for(int i = 0; i < list.size(); i++){
            print(list.get(i) + " ");
        }
    }
    private ArrayList<String> list = new ArrayList<String>();    
}
