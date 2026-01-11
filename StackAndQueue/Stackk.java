package StackAndQueue;

import java.util.Stack;

public class Stackk {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(34);
        stack.push(45);
        stack.push(22);

        stack.pop();
        stack.pop();

        System.out.println(stack);

    }
}
