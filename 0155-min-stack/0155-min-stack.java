class MinStack {
    Stack<Integer> stack;
        Stack<Integer> minst;

    public MinStack() {
        stack=new Stack<>();
        minst=new Stack<>();
    }
    
    public void push(int value) {
        stack.push(value);
        if(minst.isEmpty()){
            minst.push(value);
        }else{
            minst.push(Math.min(value,minst.peek()));
        }
    }
    
    public void pop() {
        stack.pop();
        minst.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minst.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */