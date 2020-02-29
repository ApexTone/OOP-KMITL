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
public class StackOfIntegers {

    //data fields
    private int[] elements;
    private int currSize = 0;

    //constructors
    public StackOfIntegers() {
        System.out.println("Default stack size: 50");
        this.elements = new int[50];
    }
    public StackOfIntegers(int cap) {
        System.out.println("Stack size: " + cap);
        this.elements = new int[cap];
    }

    //getter
    public int getCurrSize(){
        return currSize;
    }
    
    //methods
    public boolean isEmpty() {
        return currSize == 0;
    }

    public int peek() {
        if(!isEmpty())
            return elements[currSize-1];
        else{
            System.out.println("Stack is empty!");
            return -1;
        }
    }

    public void push(int value) {
        if(currSize+1<=elements.length)
            elements[currSize++] = value;
        else
            System.out.println("Stack is full!");
    }

    public int pop() {
        if (!isEmpty()) {
            return elements[--currSize];
        } 
        else {
            System.out.println("Stack is empty!");
            return -1;
        }
    }
    
}
