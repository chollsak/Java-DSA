package Data_Structure.Stack;

import java.util.ArrayList;

public class Palindrome {

    public static class Stack<T> {
        private ArrayList<T> arr = new ArrayList<>();

        public void push(T value) {
            arr.add(value);
        }

        public T pop() {
            if (isEmpty()) return null;
            return arr.remove(arr.size() - 1);
        }

        public boolean isEmpty() {
            return arr.isEmpty();
        }

        public int size() {
            return arr.size();
        }
    }

    public static boolean isPalindrome(String text) {
        Stack<Character> stack = new Stack<>();

        for (char c : text.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return text.contentEquals(reversed.toString());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("hello"));
    }
}
