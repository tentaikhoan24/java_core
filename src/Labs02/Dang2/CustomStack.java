package Labs02.Dang2;

public class CustomStack {
    private SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
    private Integer size = 0;

    public CustomStack(Integer value){
        singlyLinkedList.addAtTop(value);
    }

    public void push(Integer value) {
        singlyLinkedList.addAtEnd(value);
        size++;
    }

    public void pop() {
        if (isEmpty()){
            System.out.println("Stack is empty!");
        } else {
            singlyLinkedList.displayTail();
            singlyLinkedList.deleteAtEnd();
            size--;
        }
    }

    public void peek() {
        singlyLinkedList.displayTail();
    }

    public void display() {
        singlyLinkedList.display();
    }

    public Integer getSize() {
        return size;
    }

    public Boolean isEmpty() {
        if (size == 0){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        CustomStack customStack = new CustomStack(0);
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
