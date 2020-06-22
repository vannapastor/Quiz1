/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlylinkedlist;

/**
 *
 * @author user
 */
public class PerList <P>{
    private Person<P> head,tail;
    private int size;
    
    public PerList(){
        head = null;
        tail = null;      
        size = 0;
    }
     public boolean isEmpty() {
        return size <= 0;
    }
     public Person first(){
         return head;
     }
     public Person last(){
         return tail;
     }  
     
     public void addLast(Person newNode) {
       if(isEmpty())
        head = newNode;
        else
        tail.setNext(newNode); 
        tail = newNode;
        size++;   
         }
      public Person removeFirst(){
        if (head == null)
           System.err.println("Error: Attempt to remove from an empty list");
       Person temp = head;
       head = head.getNext ();
       size--;
       return temp;
    }
     
     public void addFirst(Person newNode) {
        newNode.setNext(head);
        head = newNode;
        if (isEmpty()) {
            tail = newNode;
            head.setNext(tail);
        }
        size++;
    }
   
       
       public void SinglyLinkedList(){ 
           Person temp = head;
        for (int i = 0; i < size; i++) {
            System.out.print("[" + temp.getElement() + temp.getFirstN() + temp.getLastN() + temp.getAdd() +"]");
            temp = temp.getNext();
        }
       }
}
