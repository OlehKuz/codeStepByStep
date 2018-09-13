/*Write a method named askFileName that repeatedly prompts the user for a file name until
the user types the name of a file that exists on the system. Once you get a good file name, 
return that file name as a String.*/

private String askFileName () {
    String s = readLine("Type a file name: ");
    File f = new File(s);
    while (!f.exists()){
        s = readLine("Type a file name: ");
        f = new File(s);
    }
    return s;
}
