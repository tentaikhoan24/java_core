package Labs02.Dang3;

import Labs02.Dang3.Node;

public class SinglyLinkedList {
    public Node head = null;
    public Node tail = null;

    public SinglyLinkedList() {
        head = null;
    }

    public void addAtEnd(Integer value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void addAtTop(Integer value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void deleteAtTop(){
        if (head == null){
            System.out.println("Singly Linked List is empty!");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node temp = head;
            head = head.next;
            temp.next = null;
        }
    }

    public void deleteAtEnd() {
        if (head == null){
            System.out.println("Singly Linked List is empty!");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            tail = temp;
            temp.next = null;
        }
    }

    public Boolean isEmpty() {
        return head == null;
    }

    public Integer getSize() {
        Integer size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }
    public void display() {
        Node current = head;
        if (isEmpty()){
            System.out.println("Singly Linked List is empty");
        }
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void displayHead() {
        if (isEmpty()){
            System.out.println("Singly Linked List is empty");
        } else{
            System.out.println(head.value);
        }
    }
    public void displayTail() {
        if (isEmpty()){
            System.out.println("Singly Linked List is empty");
        } else{
            System.out.println(tail.value);
        }
    }
}
