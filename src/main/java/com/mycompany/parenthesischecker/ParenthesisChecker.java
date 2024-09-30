package com.mycompany.parenthesischecker;

import java.util.Scanner;

public class ParenthesisChecker {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        scan.useDelimiter("\n");
        System.out.println("Enter a string to see if its brackets are valid");
        String input = scan.next();
        char expr[] = input.toCharArray();
        Stack.CreateStack(input.length());
        if (isValid(expr)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

    }

    public static boolean isValid(char[] expr) {
        for (int i = 0; i < expr.length; i++) {
            if (expr[i] == '(' || expr[i] == '[' || expr[i] == '{') {
                Stack.push(expr[i]);
            } else if (expr[i] == '}' || expr[i] == ']' || expr[i] == ')') {
                if (Stack.isEmpty()) {
                    return false;
                }
                if (matches((char) Stack.peek(), expr[i])) {
                    Stack.pop();
                }
            }
        }
        return Stack.isEmpty();
    }

    public static boolean matches(char char1, char char2) {
        return ((char1 == '(' && char2 == ')') || (char1 == '{' && char2 == '}') || (char1 == '[' && char2 == ']'));
    }
}
