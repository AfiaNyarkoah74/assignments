/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author Bianca Owusu
 * @param <E>
 */
public class Stack <E> {
    private Node<E> top = null;
    // initializing elements in the stack
    int size = 0; 
       /**
     * Return true if the stack is empty and false if its not
     * @return
     */
    public boolean isEmpty() {
        return top == null;
    }
       /**
     * Node class
     * @param <E> 
     */
    public class Node<E>{
        private E data;
        private Node<E> next = null;
        
        public Node(E data){
            this.data = data;
        }
    }
    
    /**
     * Returns the element at the top of stack
     * @return 
     */
    public E peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        else{           
            return top.data;
        }
    }
     /**
     * Insert an element at the top of stack.
     * @param data
     */
    public void push(E data){
        Node<E> newNode = new Node<>(data);
        
        if(top == null){
            top = newNode;
            size++;
        }
        else{
            newNode.data = data;
            newNode.next = top;
            top = newNode;
            size++;
        }
    }
    
    /**
     * Removes the top element from the stack.
     * @return
     */
    public E pop(){
        if(top == null){
            System.out.println("Stack is empty");
           return null;
        }
        E popItem = top.data;
        top = top.next;
        size--;
        return popItem;
    }
    
    /**
     * Prints the elements in stack
     */
    public void display(){
        if(top == null){
            System.out.println("Stack is empty");
        }
        else{
            Node<E> item = top;
            while (item != null) {       
                System.out.println(item.data.toString());
                item = item.next;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Instance of the stack class
        Stack<String> adt = new Stack<>();
        
        //adding elements to the stack
        adt.push("Music");
        adt.push("Games");
        adt.push("Social Media");
        adt.push("Books");
        adt.push("Health");
        adt.push("TV");
        adt.push("Camera");
        adt.push("Photos");
        
        //displaying the elements in the stack
        adt.display();
        System.out.println("The most frequently used app is: " + adt.peek());
        
        //removing elements from the stack
        adt.pop();
        adt.pop();
        adt.pop();
        
        //displaying the new elements in the stack
        System.out.println("\n");
        adt.display();       
        System.out.println("The most frequently used app is: " + adt.peek());
    }
    
}

    
    

