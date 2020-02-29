/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackOfIntegers;

/**
 *
 * @author Predator
 */
public class TestStack {
    public static void main(String[] args) {
        int cap=50;
        
        StackOfIntegers stack = new StackOfIntegers(cap);
        System.out.println(stack.isEmpty());
        
        for(int i=0;i<cap;i++){
            stack.push(i+1);
        }
        System.out.println(stack.isEmpty());
        System.out.println("Current size: "+stack.getCurrSize());
        
        System.out.println("peek: "+stack.peek());
        for (int i = cap-1; i>=0; i--) {
            System.out.println("pop: "+stack.pop());
        }
        System.out.println(stack.peek());
        stack.push(50);
        System.out.println(stack.pop());
    }
}
