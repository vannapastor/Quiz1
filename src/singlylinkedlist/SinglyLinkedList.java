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
public class SinglyLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Person<String> person1 = new Person<>("Person1",null,"firstname","lastname","address");
        Person<String> person2 = new Person<>("Person2",null,"firstname","lastname","address");
        Person<String> person3 = new Person<>("Person3",null,"firstname","lastname","address");
        Person<String> person4 = new Person<>("Person4",null,"firstname","lastname","address");
        Person<String> person5 = new Person<>("Person5",null,"firstname","lastname","address");
        
        PerList<String> PerList = new PerList<>();
            
       System.out.println("\nAddFirst()");
       PerList.addFirst(person1);
       PerList.SinglyLinkedList();
        
        System.out.println("\nAddFirst()");
        PerList.addFirst(person2);
        PerList.SinglyLinkedList();
        
        System.out.println("\nAddFirst()");
        PerList.addFirst(person3);
        PerList.SinglyLinkedList();
        
        System.out.println("\nAddFirst)");
       PerList.addFirst(person4);
        PerList.SinglyLinkedList();
        
        System.out.println("\nADD LAST");
        PerList.addLast(person5);
        PerList.SinglyLinkedList();
        
        
        System.out.println("\nAfter removeFirst()");
        PerList.removeFirst();
        PerList.SinglyLinkedList();
        
        System.out.println("\nAfter removeFirst()");
        PerList.removeFirst();
        PerList.SinglyLinkedList();
        
        System.out.println("\nAfter removeFirst()");
        PerList.removeFirst();
        PerList.SinglyLinkedList();
        
        System.out.println("\nAfter removeFirst()");
        PerList.removeFirst();
        PerList.SinglyLinkedList();
        
     }
    
}
    
   
