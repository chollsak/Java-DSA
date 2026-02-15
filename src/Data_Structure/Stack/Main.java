package Data_Structure.Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();
        stack.push("Bruno Fernandes");
        stack.push("Benjamin Sesko");
        stack.push("Matheus Cunha");
        stack.push("Casemiro");

        showStack(stack);
        stack.pop();
        showStack(stack);
        stack.push("Diego Dalot");
        showStack(stack);
    }

    public static void showStack(Stack<String> stack){
        String result = "---Stack---";
        if(!stack.empty()){
            for(int i = stack.size() - 1; i >= 0 ; i--){
                result = result + "\n" + stack.get(i);
            }
        }else{
            result = "Stack is empty";
        }

        System.out.println(result);
    }
}