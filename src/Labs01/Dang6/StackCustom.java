package Labs01.Dang6;
import java.util.*;

public class StackCustom {
    private Integer[] arr = new Integer[100];
    Integer top = -1;

    public StackCustom(){

    }

    public void push(Integer value) {
        arr[top+1] = value;
        top++;
    }

    public Integer pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        top --;
        return arr[top+1];
    }
    public Integer peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        return arr[top];
    }


    public Boolean isEmpty() {
        return top == -1;
    }

    public Boolean isFull() {
        return top == 10;
    }

    public Integer getSize() {
        if (top == -1){
            return 0;
        }
        return top + 1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
        } else {
            int count = 0;
            while (count <= top){
                System.out.print(arr[count]);
                count++;
            }
        }
    }

}
