class MyQueue {
    Stack<Integer> s = new Stack<>();
    Stack<Integer> helper = new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        s.push(x);
    }
    
    public int pop() {
        while(s.size() >1){
            helper.push(s.pop());
        }
        int front = s.pop();
        while(helper.size() > 0){
            s.push(helper.pop());
        }
        return front;
        
    }
    
    public int peek() {
        while(s.size() >1){
            helper.push(s.pop());
        }
        int front = s.peek();
        while(helper.size()>0){
            s.push(helper.pop());
        }
        return front;
        
    }
    
    public boolean empty() {
        return (s.size() == 0);   
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */