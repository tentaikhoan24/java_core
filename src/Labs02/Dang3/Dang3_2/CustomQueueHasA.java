package Labs02.Dang3.Dang3_2;

import Labs02.Dang3.SinglyLinkedList;

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
    public Integer remove() {
        if (singlyLinkedList.isEmpty()) {
            System.out.println("Queue is empty!");
            return null;
        } else {
            int data = singlyLinkedList.getHead();
            singlyLinkedList.deleteAtTop();
            return data;
        }
    }

    //retrieves but does not remove the head of this queue
    public Integer element() {
        if (singlyLinkedList.isEmpty()) {
            System.out.println("Queue is empty!");
            return null;
        } else {
            return singlyLinkedList.getHead();
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
        System.out.println(customQueueHasA.remove());;
        customQueueHasA.display();
        System.out.println(customQueueHasA.element());;
        customQueueHasA.display();
    }
}
