//225
// Implement a last-in-first-out (LIFO) stack using only two queues. The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).

// Implement the MyStack class:

// void push(int x) Pushes element x to the top of the stack.
// int pop() Removes the element on the top of the stack and returns it.
// int top() Returns the element on the top of the stack.
// boolean empty() Returns true if the stack is empty, false otherwise.
// Notes:

// You must use only standard operations of a queue, which means that only push to back, peek/pop from front, size and is empty operations are valid.
// Depending on your language, the queue may not be supported natively. You may simulate a queue using a list or deque (double-ended queue) as long as you use only a queue's standard operations.

class MyStack {
    Queue<Integer> s=new LinkedList<Integer>();

    public MyStack() {
        
     }
    
    public void push(int x) {
        s.add(x);
        int size=s.size();
        for(int i=1;i<=size-1;i++){
            int val=s.poll();
            s.add(val);
        }   
    }
    
    public int pop() {
       int xx=s.poll();
       return xx;
        
    }
    
    public int top() {
    int xx=s.peek();
       return xx;
        
    }
    
    public boolean empty() {
        if(s.isEmpty()){
            return true;
        }
        return false;
        
    }
}


// 232
// Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).

// Implement the MyQueue class:

// void push(int x) Pushes element x to the back of the queue.
// int pop() Removes the element from the front of the queue and returns it.
// int peek() Returns the element at the front of the queue.
// boolean empty() Returns true if the queue is empty, false otherwise.
// Notes:

// You must use only standard operations of a stack, which means only push to top, peek/pop from top, size, and is empty operations are valid.
// Depending on your language, the stack may not be supported natively. You may simulate a stack using a list or deque (double-ended queue) as long as you use only a stack's standard operations.

class MyQueue {
    Stack<Integer> s=new Stack<>();
    Stack<Integer> s1=new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        s.push(x);   
    }
    public int pop() {
         if(s1.empty()){
            while(!s.isEmpty()){
                s1.push(s.pop());
            }}
        Integer x1=s1.pop();
        return x1;
        
    }
    
    public int peek() {
         if(s1.empty()){
            while(!s.isEmpty()){
                s1.push(s.pop());
            }}
        Integer x1=s1.peek();
        return x1;
        
    }
    
    public boolean empty() {
        return s1.isEmpty() && s.isEmpty();
        
    }
}
//  155
// Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

// Implement the MinStack class:

// MinStack() initializes the stack object.
// void push(int val) pushes the element val onto the stack.
// void pop() removes the element on the top of the stack.
// int top() gets the top element of the stack.
// int getMin() retrieves the minimum element in the stack.
// You must implement a solution with O(1) time complexity for each function.

 class MinStack {
    Stack<Integer> s=new Stack<>();
    Stack<Integer> s1=new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
    if(s.isEmpty()){
        s.push(val);
        s1.push(val);
    }
    else{
        s.push(val);
        if(s1.peek()<val){
            s1.push(s1.peek());
        }
        else{
        s1.push(val);
        }
    }
     }
    
    public void pop() {
        s.pop();
        s1.pop();
    }
    public int top() {
        return s.peek();
        
    }
    public int getMin() {
        return s1.peek();
    }
}
 

