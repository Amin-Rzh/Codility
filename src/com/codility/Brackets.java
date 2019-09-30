package com.codility;

import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {


        solution("!@#*)(*(()))");
    }

    public static int solution(String S) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < 200000 && i < S.length(); i++) {
            switch (S.charAt(i)){
                case '(':
                    stack.push('(');
                    break;
                case '{':
                    stack.push('{');
                    break;
                case '[':
                    stack.push('[');
                    break;
                case ')':
                    if(stack.isEmpty() || stack.peek() != '(') {

                        return 0;
                    } else {
                        stack.pop();
                    }
                    break;
                case ']':
                    if(stack.isEmpty() || stack.peek() != '[') {
                        return 0;
                    } else {
                        stack.pop();
                    }
                    break;
                case '}' :
                    if(stack.isEmpty() || stack.peek() != '{') {
                        return 0;
                    } else {
                        stack.pop();
                    }
                    break;
            }
        }

        if(stack.isEmpty()){
            return 1;
        }
        return 0;

    }
}
