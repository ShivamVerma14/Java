package JavaNewPractical;

import java.util.Scanner;

class Stack {
    private int top;
    private int[] array;
    
    // Parameterized Constructor to initialise instance variable
    Stack(int capacity) {
        if(capacity <= 0)
            throw new IllegalArgumentException("Stack's capacity must be positive!!!");
        array = new int[capacity];
        top = -1;
    }
    
    // Push() to push an element in stack
    void push(int element) {
        if(top == array.length - 1)
            throw new ArrayIndexOutOfBoundsException("Stack OverFlow!!!");
        array[++top] = element;
    }
    
    // Pop() to delete the topmost element
    int pop() {
        if(top == -1)
            throw new ArrayIndexOutOfBoundsException("Stack UnderFlow!!!");
        return array[top--];
    }
}

public class demoStack {
    public static void main(String[] args) {
        int capacity = 0, element = 0;
        Scanner input = new Scanner(System.in);
        
        try {
            System.out.print("Enter the capacity of the Stack: ");
            capacity = input.nextInt();
            
            Stack storage = new Stack(capacity);
            System.out.println("Enter the elements in the Stack...");
            for(int index = 0; index < capacity; ++index) {
                element = input.nextInt();
                storage.push(element);
            }
            
            System.out.println("Now popping out the elements from Stack...");
            for(int index = capacity - 1; index >= 0; --index) 
                System.out.println(storage.pop());
        } catch(Exception E) {
            System.out.println("Exception Caught:: " + E);
        }
    }
}
