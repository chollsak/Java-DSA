package Data_Structure.Stack;

import java.util.ArrayList;

public class StackClone<T> {
    private final ArrayList<T> arr = new ArrayList<T>();

    public void push(T value){
        arr.add(value);
    }

    public T pop(){
        if(empty()){
            return null;
        }
        return arr.remove(arr.size() - 1);
    }

    public T peek(){
        System.out.println("Peeking...");
        if(empty()){
            return null;
        }
        return arr.get(arr.size()-1);
    }

    public boolean empty(){
        return (arr.isEmpty());
    }

    public void getStack() {
        if (empty()) {
            System.out.println("Stack is empty");
            return;
        }

            System.out.println("--Stack--");
            for (int i = arr.size() - 1; i >= 0; i--) {
                System.out.println(arr.get(i));
            }

    }

    public static void main(String[] args){
        StackClone<String> stackClone = new StackClone<>();
        System.out.println(stackClone.empty());
        stackClone.push("Hello");
        stackClone.push("World");
        stackClone.getStack();
        stackClone.pop();
        stackClone.getStack();
        stackClone.push("Java");
        stackClone.getStack();
        System.out.println(stackClone.peek());
    }
}

