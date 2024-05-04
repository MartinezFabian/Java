package collections.stack;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);

        int topElement = stack.pop();

        System.out.println("Top element with pop: " + topElement);
        System.out.println(stack);

        int topElement2 = stack.peek();
        System.out.println("Top element with peek: " + topElement2);
        System.out.println(stack);

        int position1 = stack.search(20);
        System.out.println("Position of element 20: " + position1);

        int position2 = stack.search(10);
        System.out.println("Position of element 10: " + position2);
        System.out.println(stack);

        boolean isEmpty = stack.isEmpty();
        System.out.println("Stack is empty: " + isEmpty);
    }
}
