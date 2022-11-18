import java.util.Stack;

public class GenericMaxStack<E extends Comparable<E>> {
    Stack<Pair<E>> stack = new Stack<Pair<E>>();
    E max;
    public void push(E val){
        if(stack.empty()) {
            this.max=val;
            Pair<E> pair = new Pair<E>();
            pair.push(val, val);
            this.stack.push(pair);
        }
        else{
            if(val.compareTo(max) == 1 ){
                max=val;
            }
            Pair<E> pair = new Pair<E>();
            pair.push(val, max);
            this.stack.push(pair);
        }
    }

    public void pop(){
        this.stack.pop();
    }

    public E max(){
        return this.stack.lastElement().second;
    }
}
