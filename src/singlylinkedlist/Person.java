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
public class Person <P> {
    private P element;
    private Person next;
    private String firstN;
    private String lastN;
    private String add;

    public Person(){
        
    }
    public Person(P element,Person next,String firstN,String lastN, String add){
        this.element = element;
        this.next = next;
        this.firstN = firstN;
        this.lastN = lastN;
        this.add = add;
    }

    /**
     * @return the element
     */
    public P getElement() {
        return element;
    }

    /**
     * @param element the element to set
     */
    public void setElement(P element) {
        this.element = element;
    }

    /**
     * @return the next
     */
    public Person getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Person next) {
        this.next = next;
    }

    /**
     * @return the firstN
     */
    public String getFirstN() {
        return firstN;
    }

    /**
     * @param firstN the firstN to set
     */
    public void setFirstN(String firstN) {
        this.firstN = firstN;
    }

    /**
     * @return the lastN
     */
    public String getLastN() {
        return lastN;
    }

    /**
     * @param lastN the lastN to set
     */
    public void setLastN(String lastN) {
        this.lastN = lastN;
    }

    /**
     * @return the add
     */
    public String getAdd() {
        return add;
    }

    /**
     * @param add the add to set
     */
    public void setAdd(String add) {
        this.add = add;
    }

    }