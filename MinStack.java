/**
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

        push(x) – Push element x onto stack.
        pop() – Removes the element on top of the stack.
        top() – Get the top element.
        getMin() – Retrieve the minimum element in the stack.

Note that all the operations have to be constant time operations.

Questions to ask the interviewer :

Q: What should getMin() do on empty stack? 
A: In this case, return -1.

Q: What should pop do on empty stack? 
A: In this case, nothing. 

Q: What should top() do on empty stack?
A: In this case, return -1


**/

class Solution {
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> minStack = new Stack<Integer>();
    
    public void push(int x) {
        stack.push(x);
        if(minStack.isEmpty())
        {
            minStack.push(x);
        }
        else
        {
            if(minStack.peek() > x)
            {
                minStack.push(x);
            }
            else
            {
                minStack.push(minStack.peek());
            }
        }
    }

    public void pop() {
        if(stack.isEmpty())
        {
            return;
        }
        stack.pop();
        minStack.pop();
    }

    public int top() {
        if(stack.isEmpty())
        {
            return -1;
        }
        return stack.peek();
    }

    public int getMin() {
        if(minStack.isEmpty())
        {
            return -1;
        }
        return minStack.peek();
    }
}
