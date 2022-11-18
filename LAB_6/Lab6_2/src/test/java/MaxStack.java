import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

public class MaxStack {
    int max;
    Vector<Integer> vMax = new Vector<Integer>();
    Stack<Integer> stack = new Stack<Integer>();
    public void push(int n){
        if(this.max<n){
            this.max=n;
            vMax.add(n);
            Collections.sort(vMax);
        }
        this.stack.push(n);
    }
    public void pop(){
        if(stack.peek()==this.max){
            vMax.remove(vMax.size()-1);
            this.max=vMax.lastElement();
        }
        this.stack.pop();
    }
    public int max(){
        return this.max;
    }
}
