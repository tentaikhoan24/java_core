package Labs02.Dang2.Dang2_1;

import Labs02.Dang2.SinglyLinkedList;

public class CustomStackIsA extends SinglyLinkedList {
    public CustomStackIsA() {
        super();
    }

    public void push(Integer value) {
        addAtEnd(value);
    }

    //retrieves and removes the head of this stack
    public Integer pop() {
        if (isEmpty()){
            System.out.println("Stack is empty!");
            return null;
        } else {
           int data = getTail();
           deleteAtEnd();
           return data;
        }
    }

    // retrieves but does not remove the head of this stack
    public Integer peek() {
        if (isEmpty()){
            System.out.println("Stack is empty!");
            return null;
        } else {
            return getTail();
        }
    }


    public Integer getSize() {
        return getSize();
    }

    public Boolean isEmpty() {
        return head == null;
    }

    public static void main(String[] args) {
        CustomStackIsA customStackIsA = new CustomStackIsA();
        customStackIsA.push(0);
        System.out.println(customStackIsA.pop());
        System.out.println(customStackIsA.isEmpty());
    }
}
