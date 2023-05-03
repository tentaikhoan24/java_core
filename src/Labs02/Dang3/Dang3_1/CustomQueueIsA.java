package Labs02.Dang3.Dang3_1;

import Labs02.Dang2.SinglyLinkedList;

public class CustomQueueIsA extends SinglyLinkedList {
    public CustomQueueIsA() {
        super();
    }

    public void add(Integer value) {
        addAtEnd(value);
    }

    public void remove(){
        displayHead();
        deleteAtTop();
    }

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
