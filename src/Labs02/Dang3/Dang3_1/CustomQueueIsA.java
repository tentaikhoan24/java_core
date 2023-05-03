package Labs02.Dang3.Dang3_1;

import Labs02.Dang2.SinglyLinkedList;

public class CustomQueueIsA extends SinglyLinkedList {
    public CustomQueueIsA() {
        super();
    }

    public void add(Integer value) {
        addAtEnd(value);
    }

    //retrieves and removes the head of this queue
    public void remove(){
        displayHead();
        deleteAtTop();
    }

    //retrieves but does not remove the head of this queue
    public void element() {
        displayHead();
    }

    public Boolean isEmpty() {
        return head == null;
    }

    public Integer getSize() {
        return getSize();
    }

    public void display() {
        display();
    }
}
