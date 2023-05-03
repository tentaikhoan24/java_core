package Labs02.Dang3.Dang3_2;

import Labs02.Dang2.SinglyLinkedList;

public class CustomQueueHasA {
    private SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

    public CustomQueueHasA() {

    }
    public CustomQueueHasA(Integer value) {
        singlyLinkedList.addAtTop(value);
    }

    public void add(Integer value) {
        singlyLinkedList.addAtEnd(value);
    }

    //retrieves and removes the head of this queue
    public void remove() {
        if (singlyLinkedList.isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            singlyLinkedList.displayHead();
            singlyLinkedList.deleteAtTop();
        }
    }

    //retrieves but does not remove the head of this queue
    public void element() {
        if (singlyLinkedList.isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            singlyLinkedList.displayHead();
        }
    }

    public Integer getSize() {
        return singlyLinkedList.getSize();
    }

    public Boolean isEmpty() {
        return singlyLinkedList.isEmpty();
    }

    public void display() {
        singlyLinkedList.display();
    }

    public static void main(String[] args) {
        CustomQueueHasA customQueueHasA = new CustomQueueHasA();
        customQueueHasA.add(1);
        customQueueHasA.add(2);
        customQueueHasA.add(3);
        customQueueHasA.display();
        customQueueHasA.remove();
        customQueueHasA.display();
        customQueueHasA.element();
        customQueueHasA.display();
    }
}
