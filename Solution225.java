/**
Implement the following operations of a stack using queues.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
empty() -- Return whether the stack is empty.
Notes:
You must use only standard operations of a queue -- which means only push to back, peek/pop from front, size, and is empty operations are valid.
Depending on your language, queue may not be supported natively. You may simulate a queue by using a list or deque (double-ended queue), as long as you use only standard operations of a queue.
You may assume that all operations are valid (for example, no pop or top operations will be called on an empty stack).
*/
class MyStack {
    
    LinkedList<Integer> queue1 = new LinkedList<Integer>();
    LinkedList<Integer> queue2 = new LinkedList<Integer>();
    
    // Push element x onto stack.
    public void push(int x) {
    	if(queue1.isEmpty()){
    		queue1.add(x);
    		while(!queue2.isEmpty()){
    			queue1.add(queue2.pop());
    		}
    	}else{
    		queue2.add(x);
    		while(!queue1.isEmpty()){
    			queue2.add(queue1.poll());
    		}
    	}
    }

    // Removes the element on top of the stack.
    public void pop() {
        if(!queue1.isEmpty()){
        	queue1.pop();
        }
        if(!queue2.isEmpty()){
        	queue2.pop();
        }
    }

    // Get the top element.
    public int top() {
    	if(!queue1.isEmpty()){
        	return queue1.peek();
        }else if(!queue2.isEmpty()){
        	return queue2.peek();
        }
    	return 0;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return queue1.isEmpty()&&queue2.isEmpty();
    }
}
