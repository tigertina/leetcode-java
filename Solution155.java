/**Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
 * }
 */
class MinStack {
    // stack: store the stack numbers  
    private Stack<Integer> stack = new Stack<Integer>();  
    // minStack: store the current min values  
    private Stack<Integer> minStack = new Stack<Integer>();  
    
    public void push(int x) {
        stack.push(x);
        if(minStack.isEmpty()||x<=minStack.peek())
            minStack.push(x);
    }

    public void pop() {
        // use equals to compare the value of two object, if equal, pop both of them  
        // peek方法返回的是一个Integer对象，所以不能直接用等号的方式比较
        int x = stack.peek();
    	int y = minStack.peek();
        if (x==y)  
            minStack.pop(); 
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();  
    }
}
