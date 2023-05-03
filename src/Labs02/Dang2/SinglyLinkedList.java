package Labs02.Dang2;

public class SinglyLinkedList {
    private Integer size = 0;
    public Node head = null;
    public Node tail = null;

    public void addAtEnd(Integer value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
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
        size++;
    }

    public void deleteAtTop(){
        if (head == null){
            System.out.println("Singly Linked List is empty!");
        } else if (size == 1) {
            head = null;
            tail = null;
        } else {
            Node temp = head;
            head = head.next;
            temp.next = null;
        }
        size--;
    }

    public void deleteAtEnd() {
        if (head == null){
            System.out.println("Singly Linked List is empty!");
        } else if (size == 1) {
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
        size--;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    public Integer getSize() {
        return  size;
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
        System.out.println(head.value);
    }
    public void displayTail() {
        System.out.println(tail.value);
    }
//    public static void main(String[] args) {
//        SinglyLinkedList sList = new SinglyLinkedList();
//
//        //Add nodes to the list
//        sList.addAtEnd(1);
//        sList.addAtEnd(2);
//        sList.addAtEnd(3);
//        sList.addAtEnd(4);
//        sList.addAtTop(0);
//        sList.display();
//        sList.deleteAtTop();
//        sList.display();
//        sList.deleteAtEnd();
//        sList.display();
//        sList.displayHead();
//        System.out.println(sList.getSize());
//    }
}
