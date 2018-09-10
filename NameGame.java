public class NameGame extends ConsoleProgram {
    public void run () {
        String s = readLine("What is your name? ");
        int space = s.indexOf(" ");
        String name = s.substring(0, space);
        String surname = s.substring(space + 1);
        Name(name);
        Surname(surname);
        
    }
    
    private void Name (String n) {
        String suffix = n.substring(1);
        printf("%s, %s, bo-B%s\n", n, n, suffix);
        printf("Banana-fana fo-F%s\n", suffix);
        printf("Fee-fi-mo-M%s\n", suffix);
        println(n.toUpperCase()+"!");
        println();
    }
    
    private void Surname (String s) {
        String suffix = s.substring(1);
        printf("%s, %s, bo-B%s\n", s, s, suffix);
        printf("Banana-fana fo-F%s\n", suffix);
        printf("Fee-fi-mo-M%s\n", suffix);
        println(s.toUpperCase()+"!");
    
    }
}
