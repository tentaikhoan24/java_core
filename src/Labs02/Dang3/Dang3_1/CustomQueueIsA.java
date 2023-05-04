package Labs02.Dang3.Dang3_1;

import Labs02.Dang3.SinglyLinkedList;

public class CustomQueueIsA extends SinglyLinkedList {
    public CustomQueueIsA() {
        super();
    }

    public void add(Integer value) {
        addAtEnd(value);
    }

    //retrieves and removes the head of this queue
    public Integer remove(){
        int data = getHead();
        deleteAtTop();
        return data;
    }

    //retrieves but does not remove the head of this queue
    public Integer element() {
        return getHead();
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
