package Labs02.Dang2.Dang2_2;

import Labs02.Dang2.SinglyLinkedList;

public class CustomStackHasA {
    private SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

    public CustomStackHasA(Integer value){
        singlyLinkedList.addAtTop(value);
    }

    public void push(Integer value) {
        singlyLinkedList.addAtEnd(value);
    }

    //retrieves and removes the head of this stack
    public void pop() {
        if (isEmpty()){
            System.out.println("Stack is empty!");
        } else {
            singlyLinkedList.displayTail();
            singlyLinkedList.deleteAtEnd();
        }
    }

    //retrieves but does not remove the head of this stack
    public void peek() {
        singlyLinkedList.displayTail();
    }

    public void display() {
        singlyLinkedList.display();
    }

    public Integer getSize() {
        return singlyLinkedList.getSize();
    }

    public Boolean isEmpty() {
        return singlyLinkedList.isEmpty();
    }

    public static void main(String[] args) {
        CustomStackHasA customStack = new CustomStackHasA(0);
        customStack.push(1);
        customStack.push(2);
        customStack.push(3);
        customStack.push(4);
        customStack.push(5);
        customStack.display();
        customStack.pop();
        customStack.pop();
        customStack.pop();
        customStack.peek();
        customStack.display();
    }
}
