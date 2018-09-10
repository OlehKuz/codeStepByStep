private void printBackward (String s) {
    String reverse = "";
    int len = s.length();
    for (int i = len - 1; i >= 0; i--) {
        reverse += s.substring(i, i + 1);
    }
    println(reverse);
}
