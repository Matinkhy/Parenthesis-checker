package com.mycompany.parenthesischecker;

public class Stack {

    private static final int DefaultSize = 20;
    private static Object[] arr;
    private static int top = -1;

    public static void CreateStack() {
        CreateStack(DefaultSize);
    }

    public static void CreateStack(int size) {
        arr = new Object[size];
    }

    public static boolean isEmpty() {
        return top == -1;
    }

    public static boolean isFull() {
        return top == arr.length - 1;
    }

    public static void push(Object obj) {
        if (isFull()) {
            System.out.println("Stack overflow");
            System.exit(1);
        }
        arr[++top] = obj;
    }

    public static Object pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            System.exit(1);
        }
        return arr[top--];
    }
    
    public static Object peek(){
    if (isEmpty()){
        System.out.println("Stack underflow");
        System.exit(1);
    }
    return arr[top];
    }
}
