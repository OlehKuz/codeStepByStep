int countDuplicates(Stack<int>& stack){
    int count = 0;
    if(!stack.isEmpty()){
        int top = stack.pop();
        if(!stack.isEmpty()){
            int bottom = stack.peek();
            if(bottom == top) count++;
            count+=countDuplicates(stack);            
        }
        stack.push(top);
    }
    return count;
}





