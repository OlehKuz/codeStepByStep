void stutterStack(Stack<int>& stack){
    if(!stack.isEmpty()){
        int value = stack.pop();
        stutterStack(stack);
        stack.push(value);
        stack.push(value);
    }
}



